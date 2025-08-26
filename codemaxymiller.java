import java.io.*;
import java.util.logging.Logger;

public class codemaxymiller {

    private static final Logger LOGGER = Logger.getLogger(codemaxymiller.class.getName());
    public static String verarquevoout;
    public static int novolinhaout;
    public static String[] veralllinhaout;
    public static int veralllinhanumeroout;

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

    public static void veralllinha(String file){
        int loop = 0;
        verarquevoout = null;

        do {
            loop++;

            verarquevo(file, loop);
        }while (verarquevoout != null);
        int loop2 = 0;
        String[] vetor = new String[loop];
        veralllinhaout = new String[loop];

        do {
            loop2++;
            verarquevo(file, loop2);
            vetor[loop2] = verarquevoout;
        }while (loop2 < loop-1);
        int loop3 = 0;

        do {
            loop3++;
            veralllinhaout[loop3] = vetor[loop3];
        }while (loop3 < loop-1);
        veralllinhanumeroout = loop;
    }
}