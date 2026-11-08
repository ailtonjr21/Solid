// LSP — versão problemática
// Tonhão herda o papel de atendente, mas não consegue cumprir seu contrato.

class Atendente {
    void anotarPedido() {
        System.out.println("Pedido anotado!");
    }
}

public class TonhaoDaChapa extends Atendente {
    @Override
    void anotarPedido() {
        throw new UnsupportedOperationException(
            "Eu sou cozinheiro, não sou garçom!"
        );
    }

    public static void main(String[] args) {
        Atendente atendente = new TonhaoDaChapa();
        atendente.anotarPedido(); // A substituição quebra o comportamento.
    }
}
