// ISP — versão organizada
// Beto implementa somente a interface de que realmente precisa.

interface Entregador {
    void entregarPedido();
}

interface Cozinheiro {
    void prepararPedido();
}

public class BetoVaptVuptCorreto implements Entregador {
    public void entregarPedido() {
        System.out.println("Beto entregou o pedido.");
    }

    public static void main(String[] args) {
        new BetoVaptVuptCorreto().entregarPedido();
    }
}
