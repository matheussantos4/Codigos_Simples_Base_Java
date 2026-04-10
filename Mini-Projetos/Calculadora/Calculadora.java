import java.util.Scanner;

public class Calculadora {

    // Calculadora simples trabalhando estrutura condicional composta
    // com as 4 operações básicas.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        String opcao;

        System.out.print("Digite um número: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();
        System.out.print("Qual cálculo deseja realizar? (Soma,Sub,Div,Mult)");

        sc.nextLine();
        opcao = sc.nextLine();
        if (opcao.equals("Soma")) {
            System.out.println("Soma:" + (num1 + num2));
        } else if (opcao.equals("Sub")) {
            System.out.println("Sub:" + (num1 - num2));
        } else if (opcao.equals("Div")) {
            System.out.println("Div:" + (num1 / num2));
        } else if (opcao.equals("Mult")) {
            System.out.println("Mult:" + (num1 * num2));
        } else {
            System.out.println("isso não é um cálculo");
        }
        sc.close();
    }
}