class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}

class Chefe extends Funcionario {
    public Chefe(String nome, String dataNascimento, double salarioFixo) {
        super(nome, dataNascimento, salarioFixo);
    }
}

class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double valorFixo, double comissao, double vendas) {
        super(nome, dataNascimento, 0);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return valorFixo + comissao * vendas;
    }
}

class Operario extends Funcionario {
    private double valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, String dataNascimento, double valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, 0);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double calcularSalario() {
        return valorProducao * quantidadeProduzida;
    }
}

class Horista extends Funcionario {
    private double valorHora;
    private int totalHorasTrabalhadas;

    public Horista(String nome, String dataNascimento, double valorHora, int totalHorasTrabalhadas) {
        super(nome, dataNascimento, 0);
        this.valorHora = valorHora;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * totalHorasTrabalhadas;
    }
}

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[8];
        funcionarios[0] = new Chefe("João", "01/01/1980", 5000);
        funcionarios[1] = new Chefe("Maria", "15/05/1975", 5500);
        funcionarios[2] = new Vendedor("Pedro", "20/07/1990", 2000, 0.1, 20000);
        funcionarios[3] = new Vendedor("Ana", "10/03/1988", 1800, 0.12, 15000);
        funcionarios[4] = new Operario("Carlos", "05/12/1995", 2.5, 1000);
        funcionarios[5] = new Operario("Laura", "30/09/1992", 2.2, 1200);
        funcionarios[6] = new Horista("Rafael", "22/11/1998", 10, 160);
        funcionarios[7] = new Horista("Isabela", "14/04/2000", 12, 140);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Salário: R$" + funcionario.calcularSalario());
        }
    }
}