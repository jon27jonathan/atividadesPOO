import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R, S, T;

        System.out.println("Digite um numero:");
        R = sc.nextInt();

        System.out.println("Digite um numero:");
        S = sc.nextInt();

        System.out.println("Digite um numero:");
        T = sc.nextInt();

        if (R >= S && R >= T) {
            System.out.println("O maior numero eh:" + R);
        } else if (S >= R && S >= T) {
            System.out.println("O maior numero eh:" + S);
        } else {
            System.out.println("O maior numero eh:" + T);
        }

    }

}
