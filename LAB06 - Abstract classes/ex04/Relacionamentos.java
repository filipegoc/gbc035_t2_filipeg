import java.util.Scanner;

abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return "Apelido: " + apelido + "\nNome: " + nome + "\nEmail: " + email + "\nAniversário: " + aniversario;
    }

    public abstract String imprimirContato();
}

class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return "Tipo: Família\n" + super.imprimirBasico() + "\nParentesco: " + parentesco;
    }
    
    public String getParentesco() {
        return parentesco;
    }
}

class Amigos extends Contato {
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String grauAmizade;
        if (grau == 1) {
            grauAmizade = "Melhor Amigo";
        } else if (grau == 2) {
            grauAmizade = "Amigo";
        } else {
            grauAmizade = "Conhecido";
        }
        return "Tipo: Amigos\n" + super.imprimirBasico() + "\nGrau de Amizade: " + grauAmizade;
    }
    
    public int getGrau() {
        return grau;
    }
}

class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return "Tipo: Trabalho\n" + super.imprimirBasico() + "\nTipo no Trabalho: " + tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}

public class Relacionamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contato[] contatos = new Contato[100];
        int numContatos = 0;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente os familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir os Melhores amigos, Irmãos e Colegas de trabalho");
            System.out.println("7. Imprimir os dados de um único contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.println("\nInserir um contato:");
                    System.out.print("Apelido: ");
                    String apelido = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Aniversário: ");
                    String aniversario = scanner.nextLine();
                    System.out.print("Tipo (Família, Amigos ou Trabalho): ");
                    String tipo = scanner.nextLine();

                    if (tipo.equalsIgnoreCase("Família")) {
                        System.out.print("Parentesco: ");
                        String parentesco = scanner.nextLine();
                        contatos[numContatos] = new Familia(apelido, nome, email, aniversario, parentesco);
                    } else if (tipo.equalsIgnoreCase("Amigos")) {
                        System.out.print("Grau de Amizade (1 - Melhor Amigo, 2 - Amigo, 3 - Conhecido): ");
                        int grau = scanner.nextInt();
                        contatos[numContatos] = new Amigos(apelido, nome, email, aniversario, grau);
                    } else if (tipo.equalsIgnoreCase("Trabalho")) {
                        System.out.print("Tipo no Trabalho: ");
                        String tipoTrabalho = scanner.nextLine();
                        contatos[numContatos] = new Trabalho(apelido, nome, email, aniversario, tipoTrabalho);
                    } else {
                        System.out.println("Tipo de contato inválido.");
                    }

                    numContatos++;
                    break;

                case 2:
                    System.out.println("\nImprimir todos os contatos:");
                    for (int i = 0; i < numContatos; i++) {
                        System.out.println(contatos[i].imprimirContato());
                    }
                    break;

                case 3:
                    System.out.println("\nImprimir somente os familiares:");
                    for (int i = 0; i < numContatos; i++) {
                        if (contatos[i] instanceof Familia) {
                            System.out.println(contatos[i].imprimirContato());
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nImprimir somente os amigos:");
                    for (int i = 0; i < numContatos; i++) {
                        if (contatos[i] instanceof Amigos) {
                            System.out.println(contatos[i].imprimirContato());
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nImprimir somente os colegas de trabalho:");
                    for (int i = 0; i < numContatos; i++) {
                        if (contatos[i] instanceof Trabalho) {
                            System.out.println(contatos[i].imprimirContato());
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nImprimir os Melhores amigos, Irmãos e Colegas de trabalho:");
                    for (int i = 0; i < numContatos; i++) {
                        if (contatos[i] instanceof Amigos) {
                            Amigos amigo = (Amigos) contatos[i];
                            if (amigo.getGrau() == 1) {
                                System.out.println("Melhor Amigo:");
                                System.out.println(amigo.imprimirContato());
                            }
                        } else if (contatos[i] instanceof Familia) {
                            Familia familiar = (Familia) contatos[i];
                            if (familiar.getParentesco().equalsIgnoreCase("irmão")) {
                                System.out.println("Irmão:");
                                System.out.println(familiar.imprimirContato());
                            }
                        } else if (contatos[i] instanceof Trabalho) {
                            Trabalho colega = (Trabalho) contatos[i];
                            if (colega.getTipo().equalsIgnoreCase("colega")) {
                                System.out.println("Colega de trabalho:");
                                System.out.println(colega.imprimirContato());
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nImprimir os dados de um único contato:");
                    System.out.print("Digite o índice do contato: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < numContatos) {
                        Contato contato = contatos[indice];
                        if (contato instanceof Familia) {
                            System.out.println("Tipo: Família");
                        } else if (contato instanceof Amigos) {
                            System.out.println("Tipo: Amigos");
                        } else if (contato instanceof Trabalho) {
                            System.out.println("Tipo: Trabalho");
                        }
                        System.out.println(contato.imprimirContato());
                    } else {
                        System.out.println("Índice de contato inválido.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}