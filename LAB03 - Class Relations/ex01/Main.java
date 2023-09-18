//Pessoa e Endereco são independentes no sentido de que cada objeto Pessoa tem uma referência separada para um objeto Endereco.
public class Main {
    public static void main(String[] args) {
        Endereco enderecoJoao = new Endereco("Avenida Paulista, 157", "São Paulo", "SP");
        Pessoa joao = new Pessoa("João", 30, enderecoJoao);

        Endereco enderecoMaria = new Endereco("Avenida Atlântica, 354", "Rio de Janeiro", "RJ");
        Pessoa maria = new Pessoa("Maria", 25, enderecoMaria);

        System.out.println("Informações de João:");
        joao.exibirInformacoes();

        System.out.println( "\nInformações de Maria:");
        maria.exibirInformacoes();
    }
}