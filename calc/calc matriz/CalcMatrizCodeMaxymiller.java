import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class CalcMatrizCodeMaxymiller {
    private static Scanner sc = new Scanner(System.in);
    private static List<ListMatriz> listMatriz = new ArrayList<>();
    public static void start() {
        System.out.println("ex.");
        System.out.println("[ 0 0 ]");
        System.out.println("[ 1 0 ] = 2\n");
        System.out.println("[ 0 0 0 ]");
        System.out.println("[ 0 0 0 ] = 3");
        System.out.println("[ 0 0 0 ]");
        System.out.print("Digite um numero: ");
        int in = sc.nextInt();
        //int loopInt = 1;
        //Boolean loop = true;
        //Boolean error = false;
        System.out.print("X   ");
        for (int i = 1; i < in; i++) {
            System.out.print(i + " ");
        }
        System.out.println(in);
        for (int i = 1; i <= in; i++) {
            System.out.print(i + " [ ");
            for (int j = 1; j <= in; j++) {
                System.out.print("0 ");
            }
            System.out.println("]");
        }
        for (int i = 1; i <= in; i++) {
            for (int j = 1; j <= in; j++) {
                System.out.print("Digite um numero [" + i + "x" + j + "]: ");
                listMatriz.add(new ListMatriz(i, j, sc.nextInt()));
            }
        }
        //System.out.println(listMatriz.getLast().getY());
        //System.out.println(listMatriz.getLast().getX());
        for (int i = 0; i < listMatriz.getLast().getY(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < listMatriz.getLast().getX(); j++) {
                System.out.print(listMatriz.get(j+(listMatriz.getLast().getX()*i)).getMatriz() + " ");
            }
            System.out.println("]");
        }
        int out = 0;
        int out2 = 0;
        //int out3;
        for (int k = 0; k < 2; k++) {
            out = 0;
            for (int i = 0; i < listMatriz.getLast().getX(); i++) {
                if (listMatriz.size() > 5 || i < 1) {
                    System.out.print("(");
                    for (int j = 0; j < listMatriz.getLast().getY(); j++) {
                        int x;
                        int y;
                        if (k == 0) {
                            x = 1 + ((j * (listMatriz.getLast().getX() + 1)) + i);
                            y = 1 + j;
                        } else {
                            x = 1 + ((j * (listMatriz.getLast().getX() + 1)) + i);
                            y = (listMatriz.getLast().getY() - j);
                            //y = 1 + j;
                            if (listMatriz.size() > 5 || k < 0) {
                                x = x + (listMatriz.getLast().getX() + 3);
                            } else {
                                x = x + (listMatriz.getLast().getX() + 2);
                            }
                        }

                        if (k == 0) {
                            while (x > (listMatriz.getLast().getX() * y)) {
                                x = x - listMatriz.getLast().getX();
                            }
                        } else {
                            while (x > (listMatriz.getLast().getX() * y)) {
                                x = x - listMatriz.getLast().getX();
                            }
                        }

                        int memol = 0;
                        for (int h = 0; h < x; h++) {
                            memol = listMatriz.get(h).getMatriz();
                        }

                        if (j > 0 && memol > 0) {
                            System.out.print("+" + memol);
                        } else {
                            System.out.print(memol);
                        }
                        out = out + memol;
                    }
                    System.out.print(") ");
                }
            }
            System.out.println("= " + out);
            if (k == 0) {
                out2 = out;
            }
        }
        System.out.println("(" + out2 + ") - (" + out + ") = " + (out2 - out));
    }
}
