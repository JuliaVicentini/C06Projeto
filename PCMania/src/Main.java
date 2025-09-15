import cliente.Cliente;
import computador.Computador;
import computador.HardwareBasico;
import computador.MemoriaUSB;
import computador.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        // promoção 1
        Computador pc1 = new Computador("Apple", 2000.00f, new SistemaOperacional("macOS Sequoia", 64));
        pc1.addHardware(new HardwareBasico("Pentium Core i3", 2200f));
        pc1.addHardware(new HardwareBasico("Memória RAM", 8f));
        pc1.addHardware(new HardwareBasico("HD", 500f));
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // promoção 2
        Computador pc2 = new Computador("Samsung", 3234.00f, new SistemaOperacional("Windows 8", 64));
        pc2.addHardware(new HardwareBasico("Pentium Core i5", 3370f));
        pc2.addHardware(new HardwareBasico("Memória RAM", 16f));
        pc2.addHardware(new HardwareBasico("HD", 1000f));
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));


        // promoção 3
        Computador pc3 = new Computador("Dell", 7678.00f, new SistemaOperacional("Windows 10", 64));
        pc3.addHardware(new HardwareBasico("Pentium Core i7", 4500f));
        pc3.addHardware(new HardwareBasico("Memória RAM", 32f));
        pc3.addHardware(new HardwareBasico("HD", 2000f));
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        int codigo;
        do {
            System.out.println("\n---- PROMOÇÕES DISPONÍVEIS ----");
            System.out.println("1 - Promoção 1 (Apple - macOS Sequoia - R$" + pc1.getPreco() + ")");
            System.out.println("2 - Promoção 2 (Samsung - Windows 8 - R$" + pc2.getPreco() + ")");
            System.out.println("3 - Promoção 3 (Dell - Windows 10 - R$" + pc3.getPreco() + ")");
            System.out.println("0 - Finalizar compra");
            System.out.print("Digite o código da promoção desejada: ");
            codigo = entrada.nextInt();

            switch (codigo) {
                case 1:
                    cliente.addComputador(pc1);
                    System.out.println("PC Apple adicionado!");
                    break;
                case 2:
                    cliente.addComputador(pc2);
                    System.out.println("PC Samsung adicionado!");
                    break;
                case 3:
                    cliente.addComputador(pc3);
                    System.out.println("PC Dell adicionado!");
                    break;
                case 0:
                    System.out.println("Compra finalizada!");
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
            }

        } while (codigo != 0);

        System.out.println("\n--COMPRA---");
        cliente.mostraCliente();

        entrada.close();
    }
}