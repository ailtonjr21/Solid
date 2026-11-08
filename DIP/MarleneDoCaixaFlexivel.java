// DIP — versão organizada
// O caixa depende da abstração FormaDePagamento, não de uma classe concreta.

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

public class MarleneDoCaixaFlexivel {
    private final FormaDePagamento formaDePagamento;

    public MarleneDoCaixaFlexivel(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    void receber() {
        formaDePagamento.pagar();
    }

    public static void main(String[] args) {
        new MarleneDoCaixaFlexivel(new Pix()).receber();
        new MarleneDoCaixaFlexivel(new Dinheiro()).receber();
        new MarleneDoCaixaFlexivel(new Cartao()).receber();
    }
}
