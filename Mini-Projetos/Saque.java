import java.util.Scanner;
import java.util.Locale;

public class Saque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.of("pt", "BR"));

        System.out.println("Digite o número da opção (Saque.1) (Consultar saldo.2) (Depósito 3) (Sair 4).");

        float saque = 0;
        float saldo = 0;

        int op = sc.nextInt();

        while (op != 4) {

            if (op == 2) {

                System.out.println("Saldo atual: " + saldo);
            } else

            if (op == 1) {
                System.out.println("Quanto quer sacar? ");
                saque = sc.nextFloat();
                if (saque < saldo) {

                    System.out.println("Saque realizado!");
                    saldo -= saque;
                } else
                    System.out.println("Saldo insuficiente!");

            } else if (op == 3) {

                System.out.println("Quanto quer depositar ?");
                saldo += sc.nextFloat();
                System.out.println("Depósito realizado!");

            } else
                System.out.println("Isso não é uma operação.");

            op = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        sc.close();
    }
}
