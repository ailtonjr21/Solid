// ISP — Interface Segregation Principle
// Beto foi contratado para entregar, mas a interface exige que faça tudo.

interface FuncionarioTudoISP {
    void atenderMesa();
    void cozinhar();
    void entregarPedido();
}

class BetoRuim implements FuncionarioTudoISP {
    public void atenderMesa() {
        throw new UnsupportedOperationException("Fui contratado para entregar!");
    }

    public void cozinhar() {
        throw new UnsupportedOperationException("Não sou cozinheiro!");
    }

    public void entregarPedido() {
        System.out.println("Beto entregou o pedido.");
    }
}

// Melhor: interfaces pequenas e específicas.
interface EntregadorISP {
    void entregarPedido();
}

interface CozinheiroISP {
    void prepararPedido();
}

class Beto implements EntregadorISP {
    public void entregarPedido() {
        System.out.println("Beto entregou o pedido.");
    }
}

class Tonhao implements CozinheiroISP {
    public void prepararPedido() {
        System.out.println("Tonhão preparou o pedido.");
    }
}

public class Isp {
    public static void main(String[] args) {
        System.out.println("=== Interface grandona ===");
        new BetoRuim().entregarPedido();

        System.out.println("\n=== Interfaces específicas ===");
        new Beto().entregarPedido();
        new Tonhao().prepararPedido();
    }
}
