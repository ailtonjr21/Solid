// LSP — versão organizada
// Tonhão não é um tipo de Atendente. Cada um cumpre seu próprio papel.

interface FuncionarioDoBoteco {
    void trabalhar();
}

class JuninDesenrola implements FuncionarioDoBoteco {
    public void trabalhar() {
        System.out.println("Junin anota o pedido.");
    }
}

public class TonhaoDaChapaCorreto implements FuncionarioDoBoteco {
    public void trabalhar() {
        System.out.println("Tonhão prepara o pedido.");
    }

    static void iniciarExpediente(FuncionarioDoBoteco funcionario) {
        funcionario.trabalhar();
    }

    public static void main(String[] args) {
        iniciarExpediente(new JuninDesenrola());
        iniciarExpediente(new TonhaoDaChapaCorreto());
    }
}
