
public class Porta {

    private String cor;
    public boolean aberta = false;
    public double dimensaoX, dimensaoY, dimensaoZ;

    public void pintar(String cor) {
        this.cor = cor;

    }

    public void mostrarCordaPorta() {
        System.out.println("A cor da porta é:" + this.cor);

    }

    public void abre() {
        if (this.aberta == false) {
            this.aberta = true;

        }
    }

    public void fechada() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    public void sitPorta() {
        if (this.aberta == true) {
            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }
    }

    public void estaAberta() {

        if (this.aberta == true) {
            System.out.println("A porta esta Aberta");

            System.out.println("A porta esta Fechada");

        }

    }

    public void mostra() {
        System.out.print("A porta " + this.cor + " de tamanho: " + this.dimensaoX + " x " + this.dimensaoY + " x "
                + this.dimensaoZ + " esta ");
        sitPorta();
    }
}
