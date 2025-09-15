package computador;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void mostraUSB() {
        System.out.println("Memória USB: " + nome + " - " + capacidade + "GB");
    }
}