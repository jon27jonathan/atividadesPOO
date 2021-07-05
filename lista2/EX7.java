import java.util.Scanner;

public class EX7 {

    private String cliente;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;
        int pagamento = 0;
        Pedido meuPedido = new Pedido();
        Produto p1 = new Produto("Banana", 5, 4.5);
        Produto p2 = new Produto("Maça", 3, 2.5);
        Produto p3 = new Produto("Arroz", 2, 5.00);
        Produto p4 = new Produto("Carne", 3, 70.00);

        meuPedido.addProduto(p1);
        meuPedido.addProduto(p2);
        meuPedido.addProduto(p3);
        meuPedido.addProduto(p4);

        meuPedido.mostraprodutos();
        System.out.println("Cliente Amanda");

        while (pagamento != 1 && pagamento != 2 && pagamento != 3) {
            System.out.println("Escolha o forma de pagamento \n1-Dinheiro\n2-Cheque\n3-Cartão");
            pagamento = sc.nextInt();
        }

        meuPedido.formaDePagamento(pagamento);
        meuPedido.imprimePrecoFinal();

    }

}
