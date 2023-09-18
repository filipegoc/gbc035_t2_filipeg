public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void exibirEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}