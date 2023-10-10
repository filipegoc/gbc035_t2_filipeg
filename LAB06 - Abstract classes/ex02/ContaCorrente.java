abstract class ContaCorrente {
    protected double saldo;
    protected int estado;
    protected int numConta;
    protected int senha;

    public static final int ATIVA = 1;
    public static final int ZERADA = 2;
    public static final int BLOQUEADA = 3;

    public ContaCorrente(double saldoInicial, int num, int senha) {
        numConta = num;
        this.senha = senha;
        saldo = saldoInicial;
        estado = ATIVA;
    }

    public abstract void debitarValor(double valor, int senha);

    public double getSaldo(int senha) {
        if (this.senha == senha)
            return saldo;
        else
            return -1;
    }

    public void creditarValor(int senha, double valor) {
        if (this.senha == senha)
            saldo += valor;
    }

    protected int getEstado(int senha) {
        if (this.senha == senha)
            return estado;
        else
            return -1;
    }

    protected void setEstado(int senha, int novoEstado) {
        if (this.senha == senha)
            estado = novoEstado;
    }

    protected boolean verificarSenha(int senha) {
        return this.senha == senha;
    }
}

class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(double saldoInicial, int num, int senha, float limite) {
        super(saldoInicial, num, senha);
        this.limite = limite;
    }

    @Override
    public void debitarValor(double valor, int senha) {
        if (this.senha != senha)
            return;

        if (estado != ATIVA)
            return;

        if (valor < 0 || (saldo + limite < valor && limite > 0))
            return;

        saldo -= valor;
        if (saldo == 0)
            estado = ZERADA;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float novoLimite) {
        limite = novoLimite;
    }
}

class ContaComum extends ContaCorrente {
    public ContaComum(double saldoInicial, int num, int senha) {
        super(saldoInicial, num, senha);
    }

    @Override
    public void debitarValor(double valor, int senha) {
        if (this.senha != senha)
            return;

        if (estado != ATIVA)
            return;

        if (valor < 0 || valor > saldo)
            return;

        saldo -= valor;
        if (saldo == 0)
            estado = ZERADA;
    }
}