import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Digite um valor para retornar seu fatorial:");
        N = sc.nextInt();
        int Aux = N;

        if (N > 0) {
            while (N > 1) {
                Aux = Aux * (N - 1);
                N--;

            }
            System.out.println(Aux);

        }

        else if (N == 0) {

            System.out.print("1");

        }

        else {
            System.out.println("-1");
        }

    }

}
