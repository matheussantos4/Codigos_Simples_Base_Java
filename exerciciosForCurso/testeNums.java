package exerciciosForCurso;

import java.util.Scanner;

public class testeNums {

    // Programa que lê N números digitados pelo usuário e exibe a soma total.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // O usuário define quantos números vai digitar.
        // Esse valor é o "limite" do loop — ele vai repetir exatamente N vezes.
        int N = sc.nextInt();

        // Acumulador: começa em 0 e vai somando cada número lido.
        int soma = 0;

        // i começa em 0 e cresce +1 a cada volta (i++).
        // O loop continua enquanto i < N, ou seja, repete exatamente N vezes.
        // Cada volta representa um número que o usuário vai digitar.
        for (int i = 0; i < N; i++) {

            // Lê o próximo número digitado pelo usuário.
            int x = sc.nextInt();

            // Adiciona x à soma acumulada.
            // soma += x é o mesmo que soma = soma + x
            soma += x;
        }

        // Exibe o resultado final após somar todos os N números.
        System.out.println(soma);

        sc.close();
    }
}