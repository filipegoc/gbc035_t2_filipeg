class Figurinha {
    private String nomeDoJogador;
    private String dataDeNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeDoJogador, String dataDeNascimento, double altura, double peso, String posicao, String pais) {
        this.nomeDoJogador = nomeDoJogador;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarFigurinha() {
        System.out.println("Nome do Jogador: " + nomeDoJogador);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}


public class FigurinhaExtra {
    private String nomeDoJogador;
    private String dataDeNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    private String raridade;
    private String cor;

    public FigurinhaExtra(String nomeDoJogador, String dataDeNascimento, double altura, double peso, String posicao, String pais, String raridade, String cor) {
        this.nomeDoJogador = nomeDoJogador;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.raridade = raridade;
        this.cor = cor;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrar() {
        System.out.println("Nome do Jogador: " + nomeDoJogador);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
        System.out.println("Raridade: " + raridade);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        System.out.println("Figurinha:");
        Figurinha figurinha1 = new Figurinha("Yuri Alberto", "18/03/2001", 182.0, 78, "Atacante", "Brasil");
        figurinha1.mostrarFigurinha();
        System.out.println("\nFigurinha Extra:");
        FigurinhaExtra figurinhaExtra1 = new FigurinhaExtra("Cristiano Ronaldo", "05/02/1985", 187.0, 83.0, "Atacante", "Portugal", "Rara", "Dourada");
        figurinhaExtra1.mostrar();
    }
}