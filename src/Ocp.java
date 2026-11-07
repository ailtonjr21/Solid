// OCP — Open/Closed Principle
// Toda nova forma de atendimento obriga Junin a alterar este código.

class AtendimentoRuim {
    void atender(String canal) {
        if (canal.equals("mesa")) {
            System.out.println("Junin atende na mesa.");
        } else if (canal.equals("telefone")) {
            System.out.println("Junin atende pelo telefone.");
        } else {
            System.out.println("Junin não conhece esse atendimento!");
        }
    }
}

// Melhor: criamos novas formas de atendimento sem alterar o atendente.
interface FormaDeAtendimento {
    void atender();
}

class AtendimentoMesa implements FormaDeAtendimento {
    public void atender() {
        System.out.println("Junin atende na mesa.");
    }
}

class AtendimentoWhatsApp implements FormaDeAtendimento {
    public void atender() {
        System.out.println("Junin atende pelo WhatsApp.");
    }
}

class AtendimentoTelefone implements FormaDeAtendimento {
    public void atender() {
        System.out.println("Junin atende pelo telefone.");
    }
}

public class Ocp {
    public static void main(String[] args) {
        System.out.println("=== Do jeito antigo ===");
        new AtendimentoRuim().atender("mesa");

        System.out.println("\n=== Estendendo sem alterar a lógica do atendente ===");
        FormaDeAtendimento atendimento = new AtendimentoWhatsApp();
        atendimento.atender();
    }
}
