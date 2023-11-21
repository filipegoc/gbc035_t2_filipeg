import java.util.Arrays;

interface Classificavel {
    int compareTo(Classificavel obj);
}

class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int compareTo(Classificavel o) {
        Produto compara = (Produto) o;
        return this.codigo - compara.codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                '}';
    }
}

class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(Classificavel o) {
        Cliente compara = (Cliente) o;
        return this.nome.compareTo(compara.nome);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

class Servico implements Classificavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int compareTo(Classificavel o) {
        Servico compara = (Servico) o;
        return Double.compare(this.preco, compara.preco);
    }

    @Override
    public String toString() {
        return "Servico{" +
                "preco=" + preco +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Alice"),
                new Cliente("Bob"),
                new Cliente("Charlie")
        };

        Produto[] produtos = {
                new Produto(3),
                new Produto(1),
                new Produto(2)
        };

        Servico[] servicos = {
                new Servico(50.0),
                new Servico(30.0),
                new Servico(20.0)
        };

        Arrays.sort(clientes, (c1, c2) -> c1.compareTo(c2));
        Arrays.sort(produtos, (p1, p2) -> p1.compareTo(p2));
        Arrays.sort(servicos, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Clientes ordenados: " + Arrays.toString(clientes));
        System.out.println("Produtos ordenados: " + Arrays.toString(produtos));
        System.out.println("Serviços ordenados: " + Arrays.toString(servicos));
    }
}