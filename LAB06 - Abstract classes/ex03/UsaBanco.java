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

public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1000, 12345, 1234, 500);
        ContaEspecial conta2 = new ContaEspecial(1500, 54321, 4321, 0);

        System.out.println("Saldo da Conta 1: " + conta1.getSaldo(1234));
        System.out.println("Saldo da Conta 2: " + conta2.getSaldo(4321));

        conta1.debitarValor(700, 1234);
        conta2.debitarValor(200, 4321);

        System.out.println("Saldo da Conta 1 após débito: " + conta1.getSaldo(1234));
        System.out.println("Saldo da Conta 2 após débito: " + conta2.getSaldo(4321));

        System.out.println("Limite da Conta 1: " + conta1.getLimite());
        conta1.setLimite(800);
        System.out.println("Novo limite da Conta 1: " + conta1.getLimite());

        conta2.debitarValor(1600, 4321);
        System.out.println("Saldo da Conta 2 após débito inválido: " + conta2.getSaldo(4321));
    }
}
