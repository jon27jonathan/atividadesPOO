public class Produto {
    private String nome;
    private double preco;
    private double quantidade;
    private double precofinal;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getnome() {
        return nome;
    }

    public double getpreco() {
        return preco;
    }

    public double getquantidade() {
        return quantidade;
    }

    public void setnome(String codigo) {
        this.nome = nome;
    }

    public void setpreco(double preço) {
        this.preco = preco;
    }

    public void setquantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double somaPreco() {
        return this.precofinal += (this.preco * this.quantidade);

    }

    public void imprime() {
        System.out.println("Produto:" + this.nome + " R$:" + this.preco + " Quantidade:" + this.quantidade + "Kg");
    }

}
