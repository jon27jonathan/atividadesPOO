package metodos;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String pai;
    protected String mae;

    public void atualizarPessoa(int idade, String pai, String mae) {
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void imprimiPessoa() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Filho de(Pai):" + this.pai);
        System.out.println("Filho de(Mãe):" + this.mae);
    }

}
