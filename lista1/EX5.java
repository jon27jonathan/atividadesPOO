import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um valor para retornar seu fatorial:");
        n = sc.nextInt();
        int aux = n;

        if (n > 0) {
            while (n > 1) {
                aux = aux * (n - 1);
                n--;

            }
            System.out.println(aux);

        }

        else if (n == 0) {

            System.out.print("1");

        }

        else {
            System.out.println("-1");
        }

    }

}
