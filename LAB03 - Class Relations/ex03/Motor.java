class Motor {
    private int cilindradas;

    public Motor(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void ligar() {
        System.out.println("Motor ligado.");
    }

    public void desligar() {
        System.out.println("Motor desligado.");
    }
}