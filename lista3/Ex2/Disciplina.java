package Ex2;

import java.util.Scanner;

public class Disciplina {
    private int nomeDisciplina;
    private String descricao;

    public void setnomeDisciplina(int nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;

    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getdisciplina() {
        return this.nomeDisciplina;
    }

    public String getdescricao() {
        return this.descricao;
    }

    static void inscDisciplina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Matérias e suas respectivas Ementas ------");
        System.out.println(
                "Ementa diciplinas: (1) - Desenvolvimento de Pessoas (2) - Programação Orientada a Objetos (3) - Sistemas Operacionais (4) - Principios de Banco de Dados ");
        System.out.println("Qual diciplina que gostaria de ver a ementa? ");
        int getnomeDisciplina = sc.nextInt();

        switch (getnomeDisciplina) {

            case 1:
                System.out.println("DESENVOLVIMENTO DE PESSOAS - P1");
                System.out.println(
                        "Desenvolvimento Gerencial, Treinamento e Desenvolvimento, Desenvolvimento Organizacional, Avaliação de Desempenho,Relações Trabalhistas,Pesquisa de Clima Organizacional, Assédio Moral e Sexual,Trabalho e Vida Pessoal. ");
                break;
            case 2:
                System.out.println("PROGRAMAÇÃO ORIENTADA A OBJETOS - B1");
                System.out.println(
                        "Princípios de Programação Orientada a Objetos, Persistência (Arquivos e fluxos) Aplicações e Estudo de Casos, Tratamento de Exceções, Classes e Objetos,  Métodos,  Herança e Hierarquia de Classes,  Interfaces e Classes Abstratas, Polimorfismo, Coleções, Threads");
                break;

            case 3:
                System.out.println("SISTEMAS OPERACIONAIS PARA SISTEMAS DE INFORMAÇÃO - B1");
                System.out.println(
                        "fundamentais de sistemas operacionais. Discutiremos sobre UCP, Memória, Processos e Interrupções, estrutura de um SO, processos e threads, concorrência, deadlocks, gerenciamento de memória e memória virtual, escalonamento de processos e multiprocessamento e sistemas de arquivos");
                break;

            case 4:
                System.out.println("PRINCIPIOS DE BANCO DE DADOS - A1");
                System.out.println(
                        "Modelo Entidade-Relacionamento, Modelos relacional (definição de dados), Estrutura de dados delacional, Regras de integridade, SQL, Mapeamento Lógico Relacional, Modelo relacional (manipulação de dados), Álgebra Relacional, SQL, Normalização, Processamento e otimização de consulta");
                break;

            default:
                System.out.println("Disciplina não existente");
                break;

        }

    }

}
