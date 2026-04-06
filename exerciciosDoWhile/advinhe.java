package exerciciosDoWhile;

import java.util.Scanner;

public class Advinhe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numSecreto = (int) (Math.random() * 10) + 1;
        int tentativas = 0;
        int chute;

        do {
            System.out.print("Chute um número de 1 a 10: ");
            chute = sc.nextInt();
            tentativas++;

            if (chute < numSecreto) {
                System.out.println("Maior! Tente novamente.");
            } else if (chute > numSecreto) {
                System.out.println("Menor! Tente novamente.");
            }

        } while (chute != numSecreto);

        System.out.println("Você acertou em " + tentativas + " tentativas!");
        sc.close();
    }
}
