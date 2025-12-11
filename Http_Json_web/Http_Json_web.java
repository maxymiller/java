import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class Http_Json_web {
    private static Logger LOGGER = Logger.getLogger(Http_Json_web.class.getName());
    private static int port = 8080;

    private static String dirhtml = "html/";
    private static String dircss = "css/";
    private static String dirjs = "js/";

    public static void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        codemaxymiller.veralllinha("config/html/host-path.txt");
        for (int loop = 1; loop < codemaxymiller.veralllinhanumeroout; loop++){
            //System.out.println(loop);
            server.createContext(codemaxymiller.veralllinhaout[loop], new AuthHandler());
        }

        server.setExecutor(null);
        server.start();

        LOGGER.info("Servidor Java (web) iniciado na " + port + "...");
        LOGGER.info("Pressione Ctrl+C para parar.");
    }

    static class AuthHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "POST, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");

            if ("OPTIONS".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(204, -1); // Resposta para pre-flight CORS
                return;
            }

            try {
                String requestBody;
                try (InputStream is = exchange.getRequestBody()) {
                    requestBody = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                }

                String path = exchange.getRequestURI().getPath();

                if ("/".equals(path)){
                    LOGGER.info("JSON Recebido do cliete: " + requestBody);
                }

                if ("GET".equals(exchange.getRequestMethod())) {

                    if ("/".equals(path)){
                        handleHtml(exchange,dirhtml + "index.html");
                    } else if ("/home".equals(path)) {
                        handleHtml(exchange, dirhtml + "index.html");
                    } else if ("/css".equals(path)) {
                        handleCss(exchange, dircss + "css.css");
                    } else if ("/js".equals(path)){
                        handleJs(exchange, dirjs + "js.js");
                    } else {
                        sendResponse(exchange, 404, "{\"message\":\"Rota não encontrada\"}");
                    }
                } else if ("POST".equals(exchange.getRequestMethod())) {

                    if ("/".equals(path)) {
                        sendResponseJson(exchange,"{" + criarJson("message", "you: /") + "}");
                    }
                } else {
                    sendResponse(exchange, 405, "{\"message\":\"Método não permitido\"}");
                }
            } catch (Exception e) {
                e.getMessage();
                sendResponse(exchange, 500, "{\"message\":\"Erro interno do servidor: " + e.getMessage() + "\"}");
            }
        }

        private void handleHtml(HttpExchange exchange, String file) throws IOException {
            String in = "";
            codemaxymiller.veralllinha(file);
            for (int loop = 1; loop < codemaxymiller.veralllinhanumeroout; loop++){
                //System.out.println(loop);
                in = in + codemaxymiller.veralllinhaout[loop] + "\n";
            }

            sendResponse(exchange, 200, in);
        }

        private void handleCss(HttpExchange exchange, String file) throws IOException {
            String in = "";
            codemaxymiller.veralllinha(file);
            for (int loop = 1; loop < codemaxymiller.veralllinhanumeroout; loop++){
                //System.out.println(loop);
                in = in + codemaxymiller.veralllinhaout[loop] + "\n";
            }

            sendResponse(exchange, 200, in);
        }

        private void handleJs(HttpExchange exchange, String file) throws IOException {
            String in = "";
            codemaxymiller.veralllinha(file);
            for (int loop = 1; loop < codemaxymiller.veralllinhanumeroout; loop++){
                //System.out.println(loop);
                in = in + codemaxymiller.veralllinhaout[loop] + "\n";
            }

            sendResponse(exchange, 200, in);
        }

        private void sendResponse(HttpExchange exchange, int statusCode, String responsebody) throws IOException {
            if (!(statusCode == 200)) {
                exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
            }else {
                //exchange.getResponseHeaders().set("Content-Type", "charset=UTF-8");
            }
            byte[] responseBytes = responsebody.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(statusCode, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        }

        private void sendResponseJson(HttpExchange exchange, String json) throws IOException {
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            sendResponse(exchange, 200, json);
        }

        private String extrairCepDoJson(String json, String valor){
            try {
                return json.split("\"" + valor + "\"")[1]
                        .split(":")[1]
                        .split("\"")[1];
            }catch (Exception e){
                return null;
            }
        }

        private String criarJson(String nome, String valor){
            return "\"" + nome + "\":\"" + valor + "\"";
        }
    }

    public static int getPort() {return port;}
    public static void setPort(int port) {Http_Json_web.port = port;}

    public static String getDirhtml(){return dirhtml;}
    public static void setDirhtml(String dirHtml){dirhtml = dirHtml;}

    public static String getDircss(){return dircss;}
    public static void setDircss(String dirCss){dircss = dirCss;}

    public static String getDirjs(){return dirjs;}
    public static void setDirjs(String dirJs){dirjs = dirJs;}
}
