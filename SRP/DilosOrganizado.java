// SRP — versão organizada
// Dilos não faz tudo: cada funcionário cuida de uma responsabilidade.

class Atendimento {
    void atender() {
        System.out.println("Junin está atendendo as mesas.");
    }
}

class Cozinha {
    void preparar() {
        System.out.println("Tonhão está preparando a porção.");
    }
}

class Caixa {
    void fechar() {
        System.out.println("Marlene está fechando o caixa.");
    }
}

public class DilosOrganizado {
    public static void main(String[] args) {
        new Atendimento().atender();
        new Cozinha().preparar();
        new Caixa().fechar();
    }
}
