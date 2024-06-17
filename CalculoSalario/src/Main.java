import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario = scan.nextFloat();
        float beneficios = scan.nextFloat();
        float valorImposto = salario <= 1100? valorImposto = 0.5f*salario : (salario >= 1100.1 && salario <= 2500? valorImposto = 0.10f*salario : 0.15f*salario);
        float salarioLiquido =  salario - valorImposto + beneficios;
        System.out.println(String.format("%.2f", salarioLiquido));
    }
}