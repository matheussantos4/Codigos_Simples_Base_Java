
// Código de estrutura condicional simples.

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:");

        num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println("Número par");
        } else
            System.out.println("Número impar");

        sc.close();

    }

}
