// OCP — versão organizada
// Novos canais podem ser adicionados criando outra implementação,
// sem modificar o código que executa o atendimento.

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

public class JuninDesenrolaFlexivel {
    static void iniciarAtendimento(FormaDeAtendimento canal) {
        canal.atender();
    }

    public static void main(String[] args) {
        iniciarAtendimento(new AtendimentoMesa());
        iniciarAtendimento(new AtendimentoWhatsApp());
        iniciarAtendimento(new AtendimentoTelefone());
    }
}
