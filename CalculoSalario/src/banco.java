import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    break;
            }
        }
    }
}
