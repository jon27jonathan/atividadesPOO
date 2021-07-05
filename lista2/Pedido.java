import java.util.Scanner;

public class Pedido {
    Produto[] produtos = new Produto[4];
    int cont = 0;
    double soma = 0;

    public void addProduto(Produto produto) {
        produtos[cont] = produto;
        cont++;
    }

    public void formaDePagamento() {
        Scanner sc = new Scanner(System.in);
        int pagamento = 0;

        while (pagamento != 1 && pagamento != 2 && pagamento != 3) {
            System.out.println("Escolha o forma de pagamento \n1-Dinheiro\n2-Cheque\n3-Cartão");
            pagamento = sc.nextInt();

            if (pagamento != 1 && pagamento != 2 && pagamento != 3) {
                System.out.println("Escolha um metodo de pagamento aceita:");
            }
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
        System.out.println(soma);

    }
}
