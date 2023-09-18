//os objetos são independentes no sentido de que cada objeto Aluno é uma instância separada e independente, e cada objeto Universidade também é uma instância separada e independente.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 101);
        Aluno aluno2 = new Aluno("Maria", 102);
        Aluno aluno3 = new Aluno("Pedro", 103);

        Universidade universidade = new Universidade("Universidade Federal de Uberlândia");
        universidade.adicionarAluno(aluno1);
        universidade.adicionarAluno(aluno2);
        universidade.adicionarAluno(aluno3);

        universidade.exibirInformacoes();
    }
}