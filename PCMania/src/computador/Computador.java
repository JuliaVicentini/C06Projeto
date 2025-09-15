package computador;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico[] hardwares = new HardwareBasico[3]; // exemplo: até 3 hardwares
    MemoriaUSB musb;

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.so = so;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public void addHardware(HardwareBasico hb) {
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] == null) {
                hardwares[i] = hb;
                break;
            }
        }
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        so.mostraSO();
        for (HardwareBasico hb : hardwares) {
            if (hb != null) {
                hb.mostraHardware();
            }
        }
        if (musb != null) {
            musb.mostraUSB();
        }
    }

    public void setMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public float getPreco() {
        return preco;
    }
}