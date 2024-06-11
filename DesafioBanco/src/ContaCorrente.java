class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    public double getLimite() {
        return super.getCliente().getContraCheque() * 0.5;
    }
}