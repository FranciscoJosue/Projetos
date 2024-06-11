public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Josué", "123.456.789-00", 2000.0);
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        banco.adicionarConta(cc1);

        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", 3000.0);
        ContaPoupanca cp1 = new ContaPoupanca(cliente2);
        banco.adicionarConta(cp1);

        banco.depositar(1, 500.0);
        banco.depositar(2, 1000.0);
        banco.sacar(1, 200.0);
        banco.transferir(2, 1, 300.0);

        banco.listarContas();
    }
}