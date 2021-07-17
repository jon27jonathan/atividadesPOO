
import java.util.Scanner;
import java.util.Vector;

public class Aluno {
    private String nomeAluno;
    private int idade;
    private String historico;

    // Limpa o buffer do enter que estava dando erro
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public Aluno(String nomeAluno, int idade) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
    }

    public void setnomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public String getnomeAluno() {
        return this.nomeAluno;

    }

    public int getidade() {
        return this.idade;
    }

    public void sethistorico(String historico) {
        Vector materias = new Vector();
        Vector notas = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de matéria:");
        int n = sc.nextInt();
        clearBuffer(sc);
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da matéria:");
            String materia = sc.nextLine();
            materias.add(materia);

        }
        for (int j = 0; j < n; j++) {
            System.out.println("Digite as notas:");
            double nota = sc.nextDouble();
            notas.add(nota);

        }
        System.out.println("Materias:" + materias);
        System.out.println("Notas:" + notas);

    }

    static void mediaAluno() {
        int numAvalicoes = 2;
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[numAvalicoes];
        float media = 0;
        System.out.println("------ Caculando Media do aluno ------");

        for (int i = 0; i < numAvalicoes; i++) {
            System.out.print("Informe a " + (i + 1) + "°" + " nota: ");
            notas[i] = sc.nextFloat();
            media += notas[i];

        }
        media /= numAvalicoes;
        for (int i = 0; i < numAvalicoes; i++) {
            if (notas[i] > media) {
                System.out.println("Media " + media);
            }
        }
    }

    static void crAluno() {
        int numMaterias = 4;
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[numMaterias];
        float media = 0;
        System.out.println("------ Caculando CR do aluno ------");

        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Informe a nota da " + (i + 1) + "°" + " matéria:");
            notas[i] = sc.nextFloat();
            media += notas[i];
        }
    }

}
