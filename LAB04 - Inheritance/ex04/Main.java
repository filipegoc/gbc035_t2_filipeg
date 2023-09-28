class C1 {
    public int atributoPublico;
    protected int atributoProtegido;
    private int atributoPrivado;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(int atributoPublico, int atributoProtegido, int atributoPrivado) {
        this.atributoPublico = atributoPublico;
        this.atributoProtegido = atributoProtegido;
        this.atributoPrivado = atributoPrivado;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public void mostrar_atributos() {
        System.out.println("Atributo Público: " + atributoPublico);
        System.out.println("Atributo Protegido: " + atributoProtegido);
        System.out.println("Atributo Privado: " + atributoPrivado);
    }

    public void mostrar_atributos_super() {
        System.out.println("Atributo Público (super): " + atributoPublico);
        System.out.println("Atributo Protegido (super): " + atributoProtegido);
        System.out.println("Atributo Privado (super): " + atributoPrivado);
    }
}

class C2 extends C1 {
    public C2() {
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(int atributoPublico, int atributoProtegido, int atributoPrivado) {
        super(atributoPublico, atributoProtegido, atributoPrivado);
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }
}

class C3 extends C2 {
    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(int atributoPublico, int atributoProtegido, int atributoPrivado) {
        super(atributoPublico, atributoProtegido, atributoPrivado);
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }
}

public class Main {
    public static void main(String[] args) {
        C3 objetoC3 = new C3(1, 2, 3);

        objetoC3.mostrar_atributos();
        System.out.println("----------");
        objetoC3.mostrar_atributos_super();
    }
}