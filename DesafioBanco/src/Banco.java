import java.util.HashMap;
import java.util.Map;

class Banco {
    private Map<Integer, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getId(), conta);
    }

    public void removerConta(int id) {
        contas.remove(id);
    }

    public Conta getConta(int id) {
        return contas.get(id);
    }

    public void depositar(int id, double valor) {
        Conta conta = contas.get(id);
        if (conta != null) {
            conta.depositar(valor);
        }
    }

    public void sacar(int id, double valor) {
        Conta conta = contas.get(id);
        if (conta != null) {
            conta.sacar(valor);
        }
    }

    public void transferir(int idOrigem, int idDestino, double valor) {
        Conta origem = contas.get(idOrigem);
        Conta destino = contas.get(idDestino);
        if (origem != null && destino != null) {
            origem.transferir(destino, valor);
        }
    }

    public void listarContas() {
        for (Conta conta : contas.values()) {
            System.out.println(conta.toString());
        }
    }
}

