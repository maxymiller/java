import java.io.*;
import java.util.logging.Logger;
import java.util.Scanner;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static String verarquevoout; // out do ver arquero String

    public static int novolinhaout; // out novo user String

    public static void main(String[] args) {
        LOGGER.severe("start java");
        Scanner s = new Scanner(System.in);
        String in, user;
        int in1;

        do {
            System.out.println("==========");
            System.out.println("(0) exit");
            System.out.println("(1) criar login");
            System.out.println("(2) login");
            System.out.println("==========");
            System.out.print("digite um número: ");
            in1 = s.nextInt();

            if (in1 == 1) {
                System.out.print("criar novo user: ");
                in = s.next();
                try(BufferedReader verlocal = new BufferedReader(new FileReader("users/" + in + ".txt"))) {
                    LOGGER.severe("error: user já foi criado");
                } catch (IOException e) {
                    novolinha(
                            "users/" + in + ".txt",
                            "você e tá logado"
                    );
                    novolinha(
                            "config/users.txt",
                            in
                    );
                    novolinha(
                            "produto/" + in + ".txt",
                            ""
                    );
                }
            } else if (in1 == 2) {
                System.out.print("login nome: ");
                user = s.next();
                verarquevo(
                        "users/" + user + ".txt",
                        1
                );
                LOGGER.info("out: " + verarquevoout);
                if (verarquevoout != null) {
                    do {
                        System.out.println("==========");
                        System.out.println("(0) exit");
                        System.out.println("(1) criar produto");
                        System.out.println("(2) ver profuto");
                        System.out.print("digite um número: ");
                        in1 = s.nextInt();
                        if (in1 == 1){
                            System.out.print("criar o produto: ");
                            in = s.next();
                            novolinha(
                                    "produto/" + user + ".txt",
                                    in
                            );

                        } else if (in1 == 2) {
                            int i = 1;
                            int y;
                            String m;
                            do {
                                verarquevo(
                                        "config/users.txt",
                                        i
                                );
                                m = verarquevoout;
                                if (m != null) {
                                    System.out.println("==========");
                                    System.out.println("users: " + m);
                                    i++;
                                    y = 2;
                                    do {
                                        verarquevo(
                                                "produto/" + m + ".txt",
                                                y
                                        );
                                        if (verarquevoout != null) {
                                            y++;
                                            System.out.println("produto: " + verarquevoout);
                                        }
                                    }while (verarquevoout != null);
                                }
                            }while (m != null);
                        }
                    }while (in1 != 0);
                    in1 = -1;
                }
            }
        }while (in1 != 0);
        //verarquevo(
        //        "config/web-config.txt", // arquevo de config
        //        4 // número da linha do arquevo
        //);
        //if (verarquevoout != null) {
        //    LOGGER.info(verarquevoout); //out do ver arquevo
        //}else {
        //    LOGGER.severe("null =nada");
        //}

        //novolinha(
        //        "users/maxymiller.txt", // arquevo do user
        //        "oi1\noi2\noi3" // texto
        //);

        LOGGER.severe("fim");
    }
    public static void verarquevo(String filename, int linhafile){
        String linha;
        try (BufferedReader leitor = new BufferedReader(new FileReader(filename))) {
            int i = 0;
            if ((linha = leitor.readLine()) != null)
                while (i < linhafile) {
                    i++;
                    //System.out.println(i + ": " + linha);
                    verarquevoout = linha;
                    linha = leitor.readLine();
                }
            //LOGGER.info("ver arquevo susesso!");
        }catch (IOException e){
            LOGGER.severe("erro ao ler o arquevo: " + e.getMessage());
        }
    }

    public static void novolinha(String filename, String texto){
        String linha;
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(filename, true))) {
            escritor.write(texto);
            escritor.newLine();
            //LOGGER.info("texto graver com susesso!");
            novolinhaout = 0;
        }catch (IOException e){
            LOGGER.severe("erro ao escrever no arquero: " + e.getMessage());
            novolinhaout = 1;
        }
    }
}