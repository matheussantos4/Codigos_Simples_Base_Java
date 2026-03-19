
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        // Toda estrutura poderia ser realizada com if-else, mas essa é uma das
        // alternativas possíveis.

        Scanner sc = new Scanner(System.in);

        System.out.println("Número correspondente ao dia da semana: ");

        int x = sc.nextInt();

        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;

            default:
                dia = "valor invalido";
        }

        // Case Break pode ser utilizado quando as tentativas possuem
        // valores fixos e não condições mais complexas.

        System.out.println("Dia da semana " + dia);
        sc.close();
    }
}
