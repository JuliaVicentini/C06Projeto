package computador;

public class SistemaOperacional {
    private String marca;
    private int tipo;

    public SistemaOperacional(String marca, int tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void mostraSO() {
        System.out.println("Sistema Operacional: " + marca + " (" + tipo + " bits)");
    }
}