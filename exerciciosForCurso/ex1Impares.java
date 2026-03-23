package exerciciosForCurso;

import java.util.Scanner;

public class ex1Impares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = 1; i <= X; i += 2) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

        sc.close();

    }

}
