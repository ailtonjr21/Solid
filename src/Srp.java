// SRP — Single Responsibility Principle
// Dilos faz tudo: atende, cozinha e fecha o caixa.

class BotecoSRPRuim {
    void atenderCliente() {
        System.out.println("Dilos: Boa noite! O que vai pedir?");
    }

    void prepararPetisco() {
        System.out.println("Dilos está preparando a porção.");
    }

    void fecharCaixa() {
        System.out.println("Dilos está fechando o caixa.");
    }
}

// Melhor: cada classe cuida de uma responsabilidade.
class AtendimentoSRP {
    void atender() {
        System.out.println("Junin está atendendo as mesas.");
    }
}

class CozinhaSRP {
    void preparar() {
        System.out.println("Tonhão está preparando a porção.");
    }
}

class CaixaSRP {
    void fechar() {
        System.out.println("Marlene está fechando o caixa.");
    }
}

public class Srp {
    public static void main(String[] args) {
        System.out.println("=== Do jeito do Dilos ===");
        BotecoSRPRuim dilos = new BotecoSRPRuim();
        dilos.atenderCliente();
        dilos.prepararPetisco();
        dilos.fecharCaixa();

        System.out.println("\n=== Com responsabilidades separadas ===");
        new AtendimentoSRP().atender();
        new CozinhaSRP().preparar();
        new CaixaSRP().fechar();
    }
}
