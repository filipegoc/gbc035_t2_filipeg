public class Main {
    public static void main(String[] args) {
        Figurinha[] figurinhas = new Figurinha[3];

        figurinhas[0] = new Figurinha("Neymar Jr.", "05/02/1992", 175, 68.5, "Atacante", "Brasil");
        figurinhas[1] = new Figurinha("Lionel Messi", "24/06/1987", 170, 72.0, "Atacante", "Argentina");
        figurinhas[2] = new Figurinha("Cristiano Ronaldo", "05/02/1985", 187, 83.0, "Atacante", "Portugal");

        for (int i = 0; i < figurinhas.length; i++) {
            System.out.println("Informações da Figurinha " + (i + 1) + ":");
            figurinhas[i].exibirInformacoes();
            System.out.println();
        }
    }
}