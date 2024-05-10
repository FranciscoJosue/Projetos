import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um número inteiro");
                int num1 = scan.nextInt();
                System.out.println("Digite um segundo número interiro");
                int num2 = scan.nextInt();

                contar(num1, num2);
                break;
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Erro: somente números inteiros são aceitaveis");
                scan.nextLine();
            }
        }
    }
    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        }

        int contagem  = num2 - num1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }


    }
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("parametros invalidos, primeiro número deve ser diferente do segundo número");
        }
    }

}
