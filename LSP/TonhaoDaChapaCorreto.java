// LSP — versão organizada
// Tonhão é cozinheiro, não uma especialização de atendente.
// Cada personagem implementa o contrato que realmente consegue cumprir.

interface Atendente {
    void anotarPedido();
}

interface Cozinheiro {
    void prepararPedido();
}

class JuninDesenrola implements Atendente {
    public void anotarPedido() {
        System.out.println("Junin anotou o pedido.");
    }
}

public class TonhaoDaChapaCorreto implements Cozinheiro {
    public void prepararPedido() {
        System.out.println("Tonhão preparou o pedido.");
    }

    public static void main(String[] args) {
        Atendente atendente = new JuninDesenrola();
        Cozinheiro cozinheiro = new TonhaoDaChapaCorreto();

        atendente.anotarPedido();
        cozinheiro.prepararPedido();
    }
}
