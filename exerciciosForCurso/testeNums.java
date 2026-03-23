package exerciciosForCurso;

import java.util.Scanner;

public class testeNums {

    // Primeiro digitar quantidade de números
    // Depois vem a soma do que foi atribuído.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);
        sc.close();

    }
}
