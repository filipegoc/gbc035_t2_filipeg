import java.util.ArrayList;
import java.util.List;

class Universidade {
    private String nome;
    private List<Aluno> alunos;

    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Universidade: " + nome);
        System.out.println("Alunos Matriculados:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
    }
}