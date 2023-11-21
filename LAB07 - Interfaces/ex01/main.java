import java.util.Arrays;

interface MeuTipoGenerico<T> {
    T obterValor();
}

class MinhaClasseGenerica<T> implements MeuTipoGenerico<T> {
    private T valor;

    public MinhaClasseGenerica(T valor) {
        this.valor = valor;
    }

    @Override
    public T obterValor() {
        return valor;
    }
}

interface Classificavel {
    boolean eMenorQue(Classificavel obj);
}

class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        return this.codigo < compara.codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        return this.nome.compareTo(compara.nome) < 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean eMenorQue(Classificavel o) {
        Servico compara = (Servico) o;
        return this.preco < compara.preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

        Arrays.sort(clientes, (c1, c2) -> c1.eMenorQue(c2) ? -1 : 1);
        Arrays.sort(produtos, (p1, p2) -> p1.eMenorQue(p2) ? -1 : 1);
        Arrays.sort(servicos, (s1, s2) -> s1.eMenorQue(s2) ? -1 : 1);

        System.out.println("Clientes ordenados: " + Arrays.toString(clientes));
        System.out.println("Produtos ordenados: " + Arrays.toString(produtos));
        System.out.println("Serviços ordenados: " + Arrays.toString(servicos));
    }
}
