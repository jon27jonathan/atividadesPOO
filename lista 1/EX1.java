import java.util.Scanner;

public class EX1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);//
        int n; // quantidades de elementos a serem inseridos no vetor

        System.out.println("Digite um valor para n:");
        n = sc.nextInt();

        int[] v = new int[n]; // vetor a ser preenchido
        int i = 0; // variavel auxiliar

        // Prenchendo o vetor.
        while (i < n) {
            System.out.println("Digite o " + (i + 1) + " numero:");
            v[i] = sc.nextInt();
            i++;
        }
        // chama o contador para verificar quais são negativos
        int contador = contadorNegativos(v);

        System.out.println("A quantidade de elementos negativos é:" + contador);
    }

    // Conta elementos negativos
    private static int contadorNegativos(int[] v) {
        int contador = 0;
        for (int x : v) {
            if (x < 0) {
                contador++;
            }
        }
        return contador;
    }

}