import java.util.Scanner;

public class EX7 {

    private String cliente;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;
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
        meuPedido.imprimePrecoFinal();
        meuPedido.formaDePagamento();

    }

}
