public class Porta {
    boolean aberta = false;
    private String Cor;
    private boolean Aberta, Fechada;
    double DimensaoX, DimensaoY, DimensaoZ;

    void pintar(String Cor) {
        this.Cor = Cor;
        System.out.println("A cor da porta é:" + this.Cor);

    }

    void Abre() {
        if (this.Aberta == false) {
            this.Aberta = true;

        }
    }

    void Fechada() {
        if (this.Aberta == true) {
            this.Aberta = false;
        }
    }

    void sitPorta() {
        if (this.Aberta == true) {
            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }
    }

    void estaAberta() {
        if (this.Aberta == true) {
            System.out.println("A porta esta Aberta");

            System.out.println("A porta esta Fechada");

        }
    }

    void mostra() {
        System.out.print("A porta " + this.Cor + " de tamanho: " + this.DimensaoX + " x " + this.DimensaoY + " x "
                + this.DimensaoZ + " esta ");
        sitPorta();
    }
}
