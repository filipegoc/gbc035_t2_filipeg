public class Main {
    public static void main(String[] args) {
        Figurinha figurinha1 = new Figurinha("Neymar Jr.", "05/02/1992", 175, 68.5, "Atacante", "Brasil");
        Figurinha figurinha2 = new Figurinha("Lionel Messi", "24/06/1987", 170, 72.0, "Atacante", "Argentina");
        Figurinha figurinha3 = new Figurinha("Cristiano Ronaldo", "05/02/1985", 187, 83.0, "Atacante", "Portugal");

        System.out.println("Informações da Figurinha 1: ");
        figurinha1.exibirInformacoes();
        System.out.println("\nInformações da Figurinha 2: ");
        figurinha2.exibirInformacoes();
        System.out.println("\nInformações da Figurinha 3: ");
        figurinha3.exibirInformacoes();
    }
}