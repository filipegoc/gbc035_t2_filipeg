public class Selecao {
    private String nomeSelecao;
    private String[] jogadoresTitulares;
    private String nomeTecnico;
    private int qtdCopasDoMundo;

    public Selecao(String nomeSelecao, String[] jogadoresTitulares, String nomeTecnico, int qtdCopasDoMundo) {
        this.nomeSelecao = nomeSelecao;
        this.jogadoresTitulares = jogadoresTitulares;
        this.nomeTecnico = nomeTecnico;
        this.qtdCopasDoMundo = qtdCopasDoMundo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Seleção: " + nomeSelecao);
        System.out.println("Jogadores Titulares:");
        for (String jogador : jogadoresTitulares) {
            System.out.println("  - " + jogador);
        }
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Número de Copas do Mundo: " + qtdCopasDoMundo);
    }

    public static void main(String[] args) {
        String[] jogadoresBrasil = {
            "Neymar Jr.", "Casemiro", "Marquinhos", "Thiago Silva", "Dani Alves",
            "Lucas Paquetá", "Firmino", "Richarlison", "Gabriel Jesus", "Everton Ribeiro", "Fred"
        };

        String[] jogadoresArgentina = {
            "Lionel Messi", "Sergio Agüero", "Ángel Di María", "Nicolás Otamendi", "Marcos Acuña",
            "Giovani Lo Celso", "Leandro Paredes", "Rodrigo De Paul", "Emiliano Martínez", "Juan Foyth", "Germán Pezzella"
        };

        Selecao selecaoBrasil = new Selecao("Seleção Brasileira", jogadoresBrasil, "Fernando Diniz", 5);
        Selecao selecaoArgentina = new Selecao("Seleção Argentina", jogadoresArgentina, "Lionel Scaloni", 2);

        System.out.println("Informações da Seleção do Brasil:");
        selecaoBrasil.exibirInformacoes();

        System.out.println("\nInformações da Seleção da Argentina:");
        selecaoArgentina.exibirInformacoes();
    }
}
