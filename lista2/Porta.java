public class Porta {
    private String Cor;
    private boolean Aberta;
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

    void estaAberta() {
        if (this.Aberta == true) {
            System.out.println("A porta esta Aberta");

            System.out.println("A porta esta Fechada");

        }
    }

}
