// ISP — versão problemática
// Beto só entrega, mas a interface obriga a atender e cozinhar também.

interface FuncionarioCompleto {
    void atenderMesa();
    void cozinhar();
    void entregarPedido();
}

public class BetoVaptVupt implements FuncionarioCompleto {
    public void atenderMesa() {
        throw new UnsupportedOperationException("Fui contratado para entregar!");
    }

    public void cozinhar() {
        throw new UnsupportedOperationException("Não sou cozinheiro!");
    }

    public void entregarPedido() {
        System.out.println("Beto entregou o pedido.");
    }

    public static void main(String[] args) {
        new BetoVaptVupt().entregarPedido();
    }
}
