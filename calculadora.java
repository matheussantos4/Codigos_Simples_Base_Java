
import java.util.Scanner;

public class calculadora {

    // Calculadora simples trabalhando estrutura condicional composta.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        String opcao;

        System.out.print("Digite um número: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();
        System.out.print("Qual cálculo deseja realizar? (Soma,Subtração,Divisão,Multiplicação) ");

        sc.nextLine();
        opcao = sc.nextLine();
        if (opcao.equals("Soma")) {
            System.out.println("Soma:" + (num1 + num2));
        } else if (opcao.equals("Subtração:")) {
            System.out.println("Subtração:" + (num1 - num2));
        } else if (opcao.equals("Divisão")) {
            System.out.println("Divisão:" + (num1 / num2));
        } else if (opcao.equals("Multiplicação")) {
            System.out.println("Multiplicação:" + (num1 * num2));
        } else

            sc.close();
    }
}
