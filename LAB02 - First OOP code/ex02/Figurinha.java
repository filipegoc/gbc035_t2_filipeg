public class Figurinha {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nome, String dataNascimento, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
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