// DIP — versão problemática
// O caixa depende diretamente de PagamentoPix.
// Para aceitar outra forma, é necessário alterar essa dependência.

class PagamentoPix {
    void pagar() {
        System.out.println("Pagamento realizado via Pix.");
    }
}

public class MarleneDoCaixa {
    private final PagamentoPix pagamento = new PagamentoPix();

    void receber() {
        pagamento.pagar();
    }

    public static void main(String[] args) {
        new MarleneDoCaixa().receber();
    }
}
