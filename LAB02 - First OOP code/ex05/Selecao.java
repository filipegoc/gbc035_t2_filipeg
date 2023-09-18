public class Selecao {
    private String nomeSelecao;
    private Figurinha[] jogadoresTitulares;
    private String nomeTecnico;
    private int numeroTitulos;

    // Construtor que recebe o nome da seleção e o nome do técnico
    public Selecao(String nomeSelecao, String nomeTecnico) {
        this.nomeSelecao = nomeSelecao;
        this.nomeTecnico = nomeTecnico;
        this.numeroTitulos = 0; // Valor padrão para o número de títulos
        this.jogadoresTitulares = new Figurinha[11]; // Inicializa o vetor com 11 jogadores
        for (int i = 0; i < 11; i++) {
            // Cria um jogador para cada posição, passando o país da seleção
            jogadoresTitulares[i] = new Figurinha(nomeSelecao);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Seleção: " + nomeSelecao);
        System.out.println("Jogadores Titulares:");
        for (int i = 0; i < jogadoresTitulares.length; i++) {
            System.out.println("  Jogador " + (i + 1) + ":");
            jogadoresTitulares[i].exibirInformacoes();
        }
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Número de Títulos: " + numeroTitulos);
    }
}
