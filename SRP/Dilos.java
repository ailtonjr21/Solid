// SRP — versão problemática
// Dilos acumula tarefas que deveriam estar separadas.

public class Dilos {
    void atenderCliente() {
        System.out.println("Dilos está atendendo as mesas.");
    }

    void prepararPetisco() {
        System.out.println("Dilos está preparando a porção.");
    }

    void fecharCaixa() {
        System.out.println("Dilos está fechando o caixa.");
    }

    public static void main(String[] args) {
        Dilos dilos = new Dilos();
        dilos.atenderCliente();
        dilos.prepararPetisco();
        dilos.fecharCaixa();
    }
}
