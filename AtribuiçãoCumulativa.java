public class AtribuiçãoCumulativa {

    // Código simples com atribuição cumulativa.

    public static void main(String[] args) {

        int saldo = 1000;

        saldo += 1500; // Recebeu salário
        System.out.println("Após salário: " + saldo);
        saldo -= 800; // Pagou aluguel
        System.out.println("Após aluguel: " + saldo);
        saldo -= 300; // pagou contas
        System.out.println("Após contas: " + saldo);
        saldo *= 0.8; // investiu uma parte
        System.out.println("Após investir: " + saldo);
        saldo /= 2; // após guardar metade
        System.out.println("Após guardar: " + saldo);

    }

}
