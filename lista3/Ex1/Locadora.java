import java.util.Scanner;

public class Locadora {
    private String modelo;
    private String placa;
    private int data;

    public void setData(int data) {
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        if (data > 0) {

            this.data = data;
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String placa) {

        this.placa = placa;
    }

}
