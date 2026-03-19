
package exerciciosWhileCurso;

import java.util.Scanner;

public class ex1Senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) { // while verifica se
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }
        sc.close();

        System.out.println("Acesso permitido!");
    }
}
