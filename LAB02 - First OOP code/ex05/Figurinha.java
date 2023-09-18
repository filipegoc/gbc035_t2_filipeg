public class Figurinha {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    // Construtor que recebe somente o país
    public Figurinha(String pais) {
        this.pais = pais;
        // Defina os demais atributos com valores padrões ou outros valores pertinentes
        this.nome = "Jogador Desconhecido";
        this.dataNascimento = "01/01/2000";
        this.altura = 0.0;
        this.peso = 0.0;
        this.posicao = "Desconhecida";
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}
