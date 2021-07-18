package main;

import metodos.Mae;
import metodos.Pai;
import metodos.Pessoa;

public class Ex1 {
    public static void main(String[] args) {
        Pessoa filho = new Pessoa();
        filho.setNome("Jonathan");
        filho.atualizarPessoa(23, "Joâo", "Dilmeia");
        filho.imprimiPessoa();
        System.out.println("--------------------------------------------------------");
        Pai pai = new Pai();
        pai.setNome("João");
        pai.atualizarPessoa(49, "Joenilda", "Wilsomar");
        pai.imprimiPessoa();
        System.out.println("--------------------------------------------------------");
        Mae mae = new Mae();
        mae.setNome(("Dilmeia"));
        mae.atualizarPessoa(50, "Dilson", "Geni");
        mae.imprimiPessoa();
    }

}
