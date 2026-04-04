import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class CalcMatrizCodeMaxymillerV4 {
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
        int xy = sc.nextInt();

        System.out.print("X  ");
        for (int i = 1; i <= xy; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= xy; i++) {
            System.out.print(i + " [");
            for (int j = 1; j <= xy; j++) {
                System.out.print(" 0");
            }
            System.out.println(" ]");
        }

        for (int i = 1; i <= xy; i++) {
            for (int j = 1; j <= xy; j++) {
                System.out.print("Digite um numero [" + i + "x" + j + "]: ");
                listMatriz.add(new ListMatriz(j, i, sc.nextInt()));
            }
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < listMatriz.size(); i++) {
            x = listMatriz.get(i).getX();
        }
        for (int i = 0; i < listMatriz.size(); i++) {
            y = listMatriz.get(i).getY();
        }
        /*for (int i = 0; i < listMatriz.size(); i++) {
            System.out.println(listMatriz.get(i).getX() + " " + listMatriz.get(i).getY() + " " + listMatriz.get(i).getMatriz());
        }*/

        for (int i = 0; i < y; i++) {
            System.out.print("[");
            for (int j = 0; j < x; j++) {
                System.out.print(" " + listMatriz.get(j + (i*y)).getMatriz());
            }
            System.out.println(" ]");
        }
        int out1 = 0;
        int out2 = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < y; j++) {
                if(j < 1 || xy > 2) {
                    if (j == 0) {
                        System.out.print("(");
                    } else {
                        System.out.print(" + (");
                    }
                    for (int k = 0; k < x; k++) {
                        int memo = 0;
                        if (i == 0) {
                            memo = k + (j + (k * x));
                            while (memo >= (x * y)) {
                                memo -= x;
                            }
                            while (listMatriz.get(memo).getY() != (k + 1)) {
                                memo -= x;
                            }
                        } else {
                            memo =  k + ((((x*y) - x) + j) - (x*k));
                            //while (memo < 0) {
                                //memo += x;
                            //}
                            while (listMatriz.get(memo).getY() != (y - (k))) {
                                memo -= x;
                            }
                        }
                        if (k != 0 && listMatriz.get(memo).getMatriz() >= 0) {
                            System.out.print("+" + listMatriz.get(memo).getMatriz());
                        } else {
                            System.out.print(listMatriz.get(memo).getMatriz());
                        }
                        if(i == 0) {
                            out1 = out1 + listMatriz.get(memo).getMatriz();
                        } else {
                            out2 = out2 + listMatriz.get(memo).getMatriz();
                        }
                    }
                    System.out.print(")");
                }
            }
            System.out.print(" = ");
            if(i == 0) {
                System.out.println(out1);
            } else {
                System.out.println(out2);
            }
        }
        System.out.println(out1 + "-" + out2 + "=" + (out1-out2));
    }
}
