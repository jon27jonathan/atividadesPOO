import java.util.Scanner;

public class DETRAN {
    private String modelo;
    private String documento;

    public String getModelo() {
        return this.modelo;
    }

    static void setDocumento(String documento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Documento do carro:");
        documento = sc.nextLine();
        System.out.println("Documento registrado");
    }

}