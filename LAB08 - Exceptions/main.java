class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double percentual) {
        double aumento = salario * (percentual / 100.0);
        double novoSalario = salario + aumento;

        if (novoSalario < 0) {
            throw new SalarioInvalidoException("Valor inválido de salário");
        }

        if (novoSalario > tetoSalarial) {
            throw new SalarioInvalidoException("Valor ultrapassa o teto");
        }

        salario = novoSalario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", tetoSalarial=" + tetoSalarial +
                '}';
    }

    public static class SalarioInvalidoException extends IllegalArgumentException {
        public SalarioInvalidoException(String mensagem) {
            super(mensagem);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("123456789", "João", 30000.0);

        try {
            funcionario.aumentarSalario(20);
        } catch (Funcionario.SalarioInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: R$ " + funcionario.getSalario());
        }
    }
}

/*
throw: É usado para lançar uma exceção manualmente em um bloco de código. Você pode usar throw para sinalizar um erro ou exceção em circunstâncias específicas.
throws: É usado na assinatura de um método para indicar que o método pode lançar uma ou mais exceções verificadas (checked exceptions). Isso alerta os chamadores do método sobre a possibilidade de exceções.

Checked Exceptions são exceções que o compilador obriga você a lidar, seja usando try-catch ou declarando no método usando throws.
Unchecked Exceptions são exceções que o compilador não obriga a lidar, tornando-as opcionais.
*/