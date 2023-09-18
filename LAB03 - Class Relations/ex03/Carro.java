class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindradas);
    }

    public void ligarCarro() {
        System.out.println("Carro da marca " + marca + " e modelo " + modelo + " ligado.");
        motor.ligar();
    }

    public void desligarCarro() {
        System.out.println("Carro da marca " + marca + " e modelo " + modelo + " desligado.");
        motor.desligar();
    }
}