//Na composição, quando um objeto composto (objeto todo) é removido, os objetos componentes (partes) também são normalmente destruídos ou tornados inacessíveis.
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2000);
        meuCarro.ligarCarro();

        Carro outroCarro = new Carro("Ford", "Focus", 1600);
        outroCarro.ligarCarro();
        outroCarro.desligarCarro();
    }
}