// LSP — Liskov Substitution Principle
// Tonhão herda de uma classe de atendente, mas não sabe atender.

class AtendenteLSP {
    void anotarPedido() {
        System.out.println("Pedido anotado!");
    }
}

class TonhaoLSP extends AtendenteLSP {
    @Override
    void anotarPedido() {
        throw new UnsupportedOperationException("Eu sou cozinheiro, não sou garçom!");
    }
}

public class Lsp {
    static void receberPedido(AtendenteLSP atendente) {
        atendente.anotarPedido();
    }

    public static void main(String[] args) {
        AtendenteLSP junin = new AtendenteLSP();
        receberPedido(junin);

        // A substituição abaixo quebra o comportamento esperado:
        AtendenteLSP tonhao = new TonhaoLSP();
        try {
            receberPedido(tonhao);
        } catch (UnsupportedOperationException erro) {
            System.out.println("Tonhão: " + erro.getMessage());
        }

        System.out.println("\nLição: não adianta herdar se a subclasse não cumpre o contrato.");
    }
}
