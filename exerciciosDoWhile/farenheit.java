package exerciciosDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.of("pt", "BR")); // permite leitura de decimais com vírgula (padrão brasileiro)

        int op = 0;
        double fh = 0;
        double C = 0;

        do {
            // exibe o menu de opções a cada iteração do loop
            System.out.println("Selecione a conversão: Farenheit para Celcius(1)");
            System.out.println("Celcius para Farenheit(2)");
            System.out.println("Sair(3)");
            op = sc.nextInt(); // lê a opção do usuário

            if (op == 1) {
                // conversão de Fahrenheit para Celsius
                System.out.print("Digite a temperatura em Farenheit: ");
                fh = sc.nextInt();
                C = (fh - 32) / 1.8;
                System.out.printf("Temperatura em Celsius: %.2f%n", C); // exibe resultado com 2 casas decimais

            } else if (op == 2) {
                // conversão de Celsius para Fahrenheit
                System.out.print("Digite a temperatura em Celcius: ");
                C = sc.nextDouble();
                fh = (C * 1.8) + 32;
                System.out.printf("Temperatura em Farenheit: %.2f%n", fh); // exibe resultado com 2 casas decimais

            } else if (op != 3)
                System.out.println("Opção inválida."); // executado se a opção não for 1, 2 ou 3

        } while (op != 3); // repete o menu enquanto o usuário não escolher sair

        System.out.println("Muito obrigado !");
        sc.close();
    }
}
