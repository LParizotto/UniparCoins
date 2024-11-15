public class CarteiraDigital {
    private double saldo;

    public CarteiraDigital() {
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("saldo adicionado com sucesso.");
        } else {
            System.out.println("valor inválido.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("pagamento realizado com sucesso.");
            } else {
                System.out.println("saldo insuficiente para realizar o pagamento.");
            }
        } else {
            System.out.println("valor inválido para pagamento.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }
}
