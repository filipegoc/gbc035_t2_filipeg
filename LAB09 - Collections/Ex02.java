import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.Deque;

abstract class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco)  {
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract double calc_cr(boolean incluiReprovacao) throws Exception;

    public void print() {
        System.out.println();
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    @Override
    public double calc_cr(boolean incluiReprovacao) {
        if (incluiReprovacao) {
            return 60;
        } else  return 10;
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}

class EstudanteMestrado extends EstudantePosGrad {
    private String tipo;
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public double calc_cr(boolean incluiReprovacao) throws Exception{
        if (incluiReprovacao)
            throw new  Exception("erro doido");
        else
            return 7;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}

abstract class EstudantePosGrad extends Estudante {
    private String formacao;
    private String linhadDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhadDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhadDePesquisa = linhadDePesquisa;
    }


    public void print() {
        super.print();
        System.out.println("EstudantePosGrad{" +
                "formacao='" + formacao + '\'' +
                ", linhadDePesquisa='" + linhadDePesquisa + '\'' +
                '}');
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhadDePesquisa() {
        return linhadDePesquisa;
    }

    public void setLinhadDePesquisa(String linhadDePesquisa) {
        this.linhadDePesquisa = linhadDePesquisa;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Deque<Estudante> dequeEstudantes = new ArrayDeque<>();

        dequeEstudantes.add(new EstudanteGraduacao("Alice", "Endereco1", "TCC1"));
        dequeEstudantes.add(new EstudanteMestrado("Bob", "Endereco2", "Formacao2", "LinhaPesquisa2", "Academico", "Dissertacao2"));
        dequeEstudantes.add(new EstudanteGraduacao("Charlie", "Endereco3", "TCC3"));

        System.out.println("Deque de estudantes:");
        for (Estudante estudante : dequeEstudantes) {
            estudante.print();
        }

        try {
            double cr = dequeEstudantes.getFirst().calc_cr(false);
            System.out.println("\nCR do primeiro estudante: " + cr);
        } catch (Exception e) {
            System.out.println("Erro ao calcular CR: " + e.getMessage());
        }

        String nomePrimeiroEstudante = dequeEstudantes.getFirst().getNome();
        System.out.println("\nNome do primeiro estudante: " + nomePrimeiroEstudante);

        if (dequeEstudantes.getFirst() instanceof EstudanteGraduacao) {
            String tituloTCC = ((EstudanteGraduacao) dequeEstudantes.getFirst()).getTituloTCC();
            System.out.println("Título do TCC do primeiro estudante de graduação: " + tituloTCC);
        } else {
            System.out.println("O primeiro estudante não é de graduação.");
        }
    }
}