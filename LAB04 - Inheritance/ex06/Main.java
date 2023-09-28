class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void escreveValor() {
        System.out.println("Valor do Ingresso: R$" + valor);
    }
}

class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return super.getValor() + valorAdicional;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + localizacao);
    }
}

class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    @Override
    public double getValorVIP() {
        return super.getValorVIP();
    }
}

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        ingresso.escreveValor();

        VIP ingressoVIP = new VIP(75.0, 25.0);
        System.out.println("Valor do Ingresso VIP: R$" + ingressoVIP.getValorVIP());

        Normal ingressoNormal = new Normal(40.0);
        ingressoNormal.imprimeTipo();

        CamaroteInferior camaroteInferior = new CamaroteInferior(60.0, 30.0, "Setor A");
        camaroteInferior.imprimeLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(80.0, 50.0);
        System.out.println("Valor do Camarote Superior: R$" + camaroteSuperior.getValorVIP());
    }
}