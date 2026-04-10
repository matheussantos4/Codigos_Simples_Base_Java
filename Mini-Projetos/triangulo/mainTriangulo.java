import java.util.Scanner;
import java.util.Locale;

/* Programa destinado a utilizar classe Triângulo para simples ilustração da programação 
orientada a objetos, sendo o objetivo principal ler as medidas dos dois
triângulos, calculando suas áreas e mostrando como resultado o que possui a maior área.*/

public class mainTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0; // Perímetro X.
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)); // Área X.

        p = (y.a + y.b + y.c) / 2.0; // Perímetro Y.
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)); // Área Y.

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

    }

}
