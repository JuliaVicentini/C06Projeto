package cliente;

import computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdComputadores = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    public void addComputador(Computador c) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = c;
            qtdComputadores++;
        } else {
            System.out.println("Não é possivel adicionar mais computadores.");
        }
    }

    public void mostraCliente() {
        System.out.println("Cliente: " + nome + " (CPF: " + cpf + ")");
        System.out.println("Computadores comprados:");

        for (int i = 0; i < qtdComputadores; i++) {
            System.out.println("\n--- Computador " + (i + 1) + " ---");
            computadores[i].mostraPCConfigs();
        }

        System.out.println("\nTotal da compra: R$ " + calculaTotalCompra());
    }
}