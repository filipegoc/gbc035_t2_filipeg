class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}