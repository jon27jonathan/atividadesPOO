import java.util.Scanner;

public class Ex2 {
    static void imprimirAluno(Aluno nova) {
        System.out.println("Nome:" + nova.getnomeAluno());
        System.out.println("Idade:" + nova.getidade());
    }

    static void imprimirInscricao(Inscricao nova) {
        System.out.println("Carga horária semanal:" + nova.getcargaHoraria() + "horas");
    }

    public static void main(String[] args) {
        System.out.println("------ Dados do Aluno ------");
        Aluno aluno1 = new Aluno("Deno", 21);
        Inscricao inscricao1 = new Inscricao("Deno", 20);
        Disciplina disciplina = new Disciplina();
        imprimirAluno(aluno1);
        imprimirInscricao(inscricao1);
        System.out.println("------- Historico ------");
        aluno1.sethistorico("historico");
        disciplina.inscDisciplina();
        aluno1.mediaAluno();
        aluno1.crAluno();
    }

}
