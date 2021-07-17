package EX2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getidade() {
        return idade;
    }

    public String getnome() {
        return nome;
    }

    public void fazAniversario() {
        this.idade++;
    }
}
