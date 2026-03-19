package exerciciosWhileCurso;

import java.util.Scanner;

public class ex2Cartesiano {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Digite coordenada Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("Segundo Quadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("Terceiro Quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("Quarto Quadrante.");
            } else {
                System.out.println("Caractere não válido.");
            }

            System.out.print("Digite coordenada X: ");
            x = sc.nextInt();
            System.out.print("Digite coordenada Y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}
