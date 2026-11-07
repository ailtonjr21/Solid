// DIP — Dependency Inversion Principle
// O caixa fica preso diretamente ao Pix.

class PagamentoPixRuim {
    void pagar() {
        System.out.println("Pagamento realizado via Pix.");
    }
}

class CaixaRuim {
    private final PagamentoPixRuim pagamento = new PagamentoPixRuim();

    void receber() {
        pagamento.pagar();
    }
}

// Melhor: o caixa depende de uma abstração.
interface FormaDePagamento {
    void pagar();
}

class Pix implements FormaDePagamento {
    public void pagar() {
        System.out.println("Pagamento realizado via Pix.");
    }
}

class Dinheiro implements FormaDePagamento {
    public void pagar() {
        System.out.println("Pagamento realizado em dinheiro.");
    }
}

class Cartao implements FormaDePagamento {
    public void pagar() {
        System.out.println("Pagamento realizado no cartão.");
    }
}

class Caixa {
    private final FormaDePagamento formaDePagamento;

    Caixa(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    void receber() {
        formaDePagamento.pagar();
    }
}

public class Dip {
    public static void main(String[] args) {
        System.out.println("=== Caixa preso ao Pix ===");
        new CaixaRuim().receber();

        System.out.println("\n=== Caixa que aceita diferentes formas ===");
        new Caixa(new Pix()).receber();
        new Caixa(new Dinheiro()).receber();
        new Caixa(new Cartao()).receber();
    }
}
