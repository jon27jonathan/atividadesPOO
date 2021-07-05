public class Pedido {
    Produto[] produtos = new Produto[4];
    int cont = 0;
    double soma = 0;

    public void addProduto(Produto produto) {
        produtos[cont] = produto;
        cont++;
    }

    public void formaDePagamento(int fPagamento) {
        if (fPagamento == 1) {
            System.out.println("O pagamento será em Dinheiro");
        } else if (fPagamento == 2) {
            System.out.println("O pagamento será em Cheque");
        } else if (fPagamento == 3) {
            System.out.println("O pagamento será em Cartão");
        }
    }

    public void mostraprodutos() {

        for (int i = 0; i < produtos.length; i++) {
            produtos[i].imprime();

        }
    }

    public void imprimePrecoFinal() {
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].somaPreco();

        }
        System.out.println("O preço final dos produtos adicionados é de R$" + soma);

    }
}
