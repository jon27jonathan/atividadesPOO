public class Porta {

    private String cor;
    boolean aberta = false;
    double dimensaoX, dimensaoY, dimensaoZ;

    void pintar(String cor) {
        this.cor = cor;

    }

    void mostrarCordaPorta() {
        System.out.println("A cor da porta é:" + this.cor);

    }

    void abre() {
        if (this.aberta == false) {
            this.aberta = true;

        }
    }

    void fechada() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    void sitPorta() {
        if (this.aberta == true) {
            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }
    }

    void estaAberta() {

        if (this.aberta == true) {
            System.out.println("A porta esta Aberta");

            System.out.println("A porta esta Fechada");

        }

    }

    void mostra() {
        System.out.print("A porta " + this.cor + " de tamanho: " + this.dimensaoX + " x " + this.dimensaoY + " x "
                + this.dimensaoZ + " esta ");
        sitPorta();
    }
}
