import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class SqlServidor {
    private static Logger LOGGER = Logger.getLogger(SqlServidor.class.getName());

    private static String sqlDriver = "jdbc:mysql://";
    private static String url = "localhost:3306/";
    private static String user = "root";
    private static String senha = "1234";

    public static Connection connection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(sqlDriver + url, user, senha);

            LOGGER.info("Conectado do servidor: \"" + url + "\"");
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            LOGGER.severe("Erro ao conectar do sevidor: " + e.getMessage());
            return null;
        }
    }

    public static String getUrl(){return url;}
    public static void setUrl(String Url){url = Url;}

    public static String getUser(){return user;}
    public static void setUser(String User){user = User;}

    public static String getSenha(){return senha;}
    public static void setSenha(String Senha){senha = Senha;}
}
