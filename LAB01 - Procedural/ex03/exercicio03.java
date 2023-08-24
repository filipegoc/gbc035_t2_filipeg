import java.util.Scanner;

public class exercicio03 {
    public static void ex01() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[6];

        System.out.println("Informe 6 valores inteiros:");
        valores[0] = input.nextInt();
        valores[1] = input.nextInt();
        valores[2] = input.nextInt();
        valores[3] = input.nextInt();
        valores[4] = input.nextInt();
        valores[5] = input.nextInt();

        System.out.println("\nValores lidos:");
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);
        System.out.println(valores[4]);
        System.out.println(valores[5]);
        
    }

    public static void ex02() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[6];

        System.out.println("Informe 6 valores inteiros:");

        for (int i = 0; i < 6; i++) {
            valores[i] = input.nextInt();
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
    }

    public static void ex03() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[6];

        System.out.println("Informe 6 valores inteiros:");

        for (int i = 5; i >= 0; i--) {
            valores[i] = input.nextInt();
        }

        System.out.println("\nValores lidos em ordem inversa:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
    }
    
    public static void ex04() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[6];
        int resto;

        System.out.println("Informe 6 valores inteiros:");

        for (int i = 0; i < 6; i++) {
            valores[i] = input.nextInt();
            resto = valores[i] % 2;
            if(resto == 1){
                System.out.println("Valor invalido, digite outro:");
                i--;
            }
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
    }

    public static void ex05() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        float media=0;

        System.out.println("Informe 5 valores inteiros:");

        for (int i = 0; i < 5; i++) {
            valores[i] = input.nextInt();
            media += valores[i];

            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("\nMaior valor: " + maior);
        System.out.println("\nMenor valor: " + menor);
        System.out.println("\nMedia: " + media/5);
    }

    public static void ex06() {
        Scanner input = new Scanner(System.in);
        
        int[] valores = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posMenor = -1, posMaior = -1;
        float media=0;

        System.out.println("Informe 5 valores inteiros:");

        for (int i = 0; i < 5; i++) {
            valores[i] = input.nextInt();
            media += valores[i];

            if (valores[i] > maior) {
                maior = valores[i];
                posMaior = i+1;
            }

            if (valores[i] < menor) {
                menor = valores[i];
                posMenor = i+1;
            }
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("\nMaior valor: " + maior + ", posição: " + posMaior);
        System.out.println("\nMenor valor: " + menor + ", posição: " + posMenor);
        System.out.println("\nMedia: " + media/5);
    }

    public static void ex07() {
        Scanner input = new Scanner(System.in);

        int[] notas = new int[5];
        int maiorNota = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota aluno " + (i + 1) + ": ");
            
            notas[i] = input.nextInt();

            if (notas[i] > notas[maiorNota]) {
                maiorNota = i;
            }
        }

        notas[maiorNota] = 100;

        System.out.println("Notas normalizadas:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
    }

    public static void ex09() {
        Scanner input = new Scanner(System.in);

        int quantidadeAlunos;

        do {
            System.out.print("Informe a quantidade de alunos na sala (entre 1 e 100): ");
            quantidadeAlunos = input.nextInt();
        } while (quantidadeAlunos < 1 || quantidadeAlunos > 100);

        double[] notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        System.out.println("\nNotas dos alunos:");

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
    }

    public static void ex10() {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] resultado = new int[3];

        System.out.println("Primeiro vetor:");
        for (int i = 0; i < 3; i++) {
            vetor1[i] = input.nextInt();
        }

        System.out.println("Segundo vetor:");
        for (int i = 0; i < 3; i++) {
            vetor2[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            resultado[i] = vetor1[i] - vetor2[i];
        }

        System.out.println("Resultado da subtração dos vetores:");
        for (int i = 0; i < 3; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static void ex11() {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] pares;
        int[] impares;

        System.out.println("Digite 5 valores:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
        }

        int quantidadePares = contarPares(numeros);
        int quantidadeImpares = 5 - quantidadePares;

        pares = new int[quantidadePares];
        impares = new int[quantidadeImpares];

        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePares] = numeros[i];
                indicePares++;
            } else {
                impares[indiceImpares] = numeros[i];
                indiceImpares++;
            }
        }

        System.out.println("Valores pares:");
        for (int valor : pares) {
            System.out.println(valor);
        }

        System.out.println("Valores ímpares:");
        for (int valor : impares) {
            System.out.println(valor);
        }
    }

    public static int contarPares(int[] numeros) {
        int quantidade = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void ex12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de bolinhas azuis: ");
        int azul = scanner.nextInt();

        System.out.print("Quantidade de bolinhas amarelas: ");
        int amarela = scanner.nextInt();

        System.out.print("Quantidade de bolinhas verdes: ");
        int verde = scanner.nextInt();

        System.out.print("Quantidade de bolinhas vermelhas: ");
        int vermelha = scanner.nextInt();

        int total = azul + amarela + verde + vermelha;

        double probabilidadeAzul = (double) azul / total * 100;
        double probabilidadeAmarela = (double) amarela / total * 100;
        double probabilidadeVerde = (double) verde / total * 100;
        double probabilidadeVermelha = (double) vermelha / total * 100;

        System.out.println("Probabilidade de sair cada cor:");
        System.out.println("Azul: " + probabilidadeAzul + "%");
        System.out.println("Amarela: " + probabilidadeAmarela + "%");
        System.out.println("Verde: " + probabilidadeVerde + "%");
        System.out.println("Vermelha: " + probabilidadeVermelha + "%");

        double maiorProbabilidade = Math.max(Math.max(probabilidadeAzul, probabilidadeAmarela),
                                             Math.max(probabilidadeVerde, probabilidadeVermelha));

        if (maiorProbabilidade == probabilidadeAzul) {
            System.out.println("A cor com maior probabilidade é: Azul");
        } else if (maiorProbabilidade == probabilidadeAmarela) {
            System.out.println("A cor com maior probabilidade é: Amarela");
        } else if (maiorProbabilidade == probabilidadeVerde) {
            System.out.println("A cor com maior probabilidade é: Verde");
        } else if (maiorProbabilidade == probabilidadeVermelha) {
            System.out.println("A cor com maior probabilidade é: Vermelha");
        }
    }

    public static void ex13() {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 valores inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("Zerando os negativos, obtém-se:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void ex14() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos a serem cadastrados (entre 1 e 10000): ");
        int quantidadeAlunos = input.nextInt();

        
        if (quantidadeAlunos < 1 || quantidadeAlunos > 10000) {
            System.out.println("Quantidade inválida. Encerrando o programa.");
            return;
        }

        int[] matriculas = new int[quantidadeAlunos];
        char[] classesSociais = new char[quantidadeAlunos];
        float[] cra = new float[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe a matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = input.nextInt();

            System.out.print("Informe a classe social do aluno " + (i + 1) + " (A, B, C, D ou E): ");
            classesSociais[i] = input.next().charAt(0);

            System.out.print("Informe o CRA do aluno " + (i + 1) + ": ");
            cra[i] = input.nextFloat();
        }

        System.out.println("Cadastro de alunos concluído.");

        System.out.println("\nDados cadastrados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("\tMatrícula: " + matriculas[i]);
            System.out.println("\tClasse social: " + classesSociais[i]);
            System.out.println("\tCRA: " + cra[i]);
            System.out.println();
        }
    }

    public static void ex15() {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[8];

        System.out.println("Informe 8 valores inteiros:");

        for (int i = 0; i < 8; i++) {
            vetor[i] = input.nextInt();
        }

        boolean existemValoresIguais = false;

        System.out.println("Valores iguais encontrados:");

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                    existemValoresIguais = true;
                }
            }
        }

        if (!existemValoresIguais) {
            System.out.println("Nenhum valor igual encontrado.");
        }
    }

    public static void main(String[] args) {
        ex15();
    }
}