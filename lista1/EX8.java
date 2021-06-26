import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int[4][4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Qual o valor de " + (i + 1) + "X" + (j + 1) + "?");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehQuadradoMagico = true;
        int primeiraLinha = 0;
        int primeiraColuna = 0;

        for (i = 0; i < 4; i++) {
            int totalLinha = 0;
            int totalColuna = 0;
            for (j = 0; j < 4; j++) {
                if (i == 0) {
                    primeiraLinha += matriz[i][j];
                    primeiraColuna += matriz[j][i];
                }
                totalLinha += matriz[i][j];
                totalColuna += matriz[j][i];
            }
            if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna
                    || primeiraColuna != primeiraLinha) {
                ehQuadradoMagico = false;
            }
        }
        if (ehQuadradoMagico) {
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
    }

}
