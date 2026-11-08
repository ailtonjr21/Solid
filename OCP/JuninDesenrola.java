// OCP — versão problemática
// Toda nova forma de atendimento exige alterar este método.

public class JuninDesenrola {
    void atender(String canal) {
        if (canal.equals("mesa")) {
            System.out.println("Junin atende na mesa.");
        } else if (canal.equals("telefone")) {
            System.out.println("Junin atende pelo telefone.");
        } else {
            System.out.println("Junin não conhece esse atendimento!");
        }
    }

    public static void main(String[] args) {
        new JuninDesenrola().atender("mesa");
        new JuninDesenrola().atender("WhatsApp");
    }
}
