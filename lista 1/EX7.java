import java.util.Scanner;

public class EX7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float nota = 0;
        int totaldeVotos;
        int contPessimos = 0, contRuins = 0, contBons = 0, contOtimos = 0;

        while (nota >= 0 && nota <= 100) {
            System.out.println("Digite uma nota:");
            nota = sc.nextInt();

            if (nota > 0 && nota <= 25) {

                contPessimos++;

            } else if (nota > 25 && nota <= 50) {

                contRuins++;

            } else if (nota > 50 && nota <= 75) {

                contBons++;

            } else if (nota > 75 && nota <= 100) {

                contOtimos++;

            }

        }
        totaldeVotos = (contPessimos + contRuins + contBons + contOtimos);

        System.out.println(contPessimos);

        float porcentagemPessimos = (contPessimos * 100) / totaldeVotos;
        System.out.println(porcentagemPessimos);
        float porcentagemRuins = (contRuins * 100) / totaldeVotos;
        System.out.println(porcentagemRuins);
        float porcentagemBons = ((contBons * 100) / totaldeVotos);
        System.out.println(porcentagemBons);
        float porcentagemOtimos = ((contOtimos * 100) / totaldeVotos);
        System.out.println(porcentagemOtimos);

    }

}
