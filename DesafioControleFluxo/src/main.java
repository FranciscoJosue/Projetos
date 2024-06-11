import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        // Loop infinito para solicitar saques até que o usuário encerre
        while (true) {
            double saque = scanner.nextDouble();
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
