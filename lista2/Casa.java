public class Casa {

    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pinta(String tinta) {
        this.cor = tinta;
    }

    int qtPtAberta() { // verifica quantas portas estão abertas
        int qtAberta = 0;

        if (this.porta1.aberta == true) {
            qtAberta += 1;
        }

        if (this.porta2.aberta == true) {
            qtAberta += 1;
        }

        if (this.porta3.aberta == true) {
            qtAberta += 1;
        }
        return qtAberta;
    }

    void mostrar() {
        int qtAberta;

        qtAberta = this.qtPtAberta();
        System.out.println("A casa " + this.cor + " esta com " + qtAberta + " porta(s) abertas");
    }
}
