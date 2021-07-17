import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o estilo de data preferida?");
        System.out.println("(1) DD/MM/AAAA");
        System.out.println("(2) 8, AGOSTO, 2007");
        System.out.println("(3) DDD/AAAA");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Dia: ");
            int getdia = sc.nextInt();
            System.out.println("Mes: ");
            int getmes = sc.nextInt();
            System.out.println("Ano ");
            int getano = sc.nextInt();
            Data data1 = new Data(getdia, getmes, getano);
            ImprimirData1(data1);
        }
        if (n == 2) {
            System.out.println("Dia: ");
            int getdia = sc.nextInt();
            System.out.println("Mes: ");
            String getmesAux = sc.next();
            System.out.println("Ano: ");
            int getano = sc.nextInt();
            Data data1 = new Data(getdia, getmesAux, getano);
            ImprimirData2(data1);
        }
        if (n == 3) {
            System.out.println("Dia: ");
            int getdia = sc.nextInt();
            System.out.println("Ano: ");
            int getano = sc.nextInt();
            Data data1 = new Data(getdia, getano);
            ImprimirData3(data1);

        }

    }

    static void ImprimirData1(Data nova) {

        System.out.println("Dia: " + nova.getdia() + "/" + nova.getmes() + "/" + nova.getano());

    }

    static void ImprimirData2(Data nova) {
        System.out.println("Dia: " + nova.getdia() + "," + nova.getmesAux() + "," + nova.getano());
    }

    static void ImprimirData3(Data nova) {
        System.out.println("Dia: " + nova.getdia() + "/" + nova.getano());
    }

}
