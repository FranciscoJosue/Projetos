import java.util.HashMap;
import java.util.Map;
class Cliente {
    private String nome;
    private String cpf;
    private double contraCheque;

    public Cliente(String nome, String cpf, double contraCheque) {
            this.nome = nome;
            this.cpf = cpf;
            this.contraCheque = contraCheque;
    }

    public String getNome() {
            return nome;
    }

    public String getCpf() {
            return cpf;
    }

    public double getContraCheque() {
            return contraCheque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", ContraCheque: " + contraCheque;
    }
}

