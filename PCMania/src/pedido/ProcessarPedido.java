package pedido;

import computador.Computador;

public class ProcessarPedido {
    public static void helper(Computador[] computadores) {
        if (computadores == null || computadores.length == 0) {
            System.out.println("Nenhum pedido.");
        } else {
            System.out.println("Pedido enviado...");
        }
    }
}