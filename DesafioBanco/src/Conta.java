class Conta {
    private static int nextId = 1;
    private int id;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.id = nextId++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + cliente.toString() + ", Saldo: " + saldo;
    }
}

