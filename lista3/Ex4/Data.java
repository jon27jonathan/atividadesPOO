package Ex4;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesAux;
    private int diaAux;

    public Data(int diaAux, String mesAux, int ano) {
        this.mesAux = mesAux;
        this.diaAux = diaAux;
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int ano) {
        this.dia = dia;
        this.ano = ano;
    }

    public void setdia(int dia) {
        this.dia = dia;
    }

    public void setdiaAux(int diaAux) {
        this.diaAux = diaAux;
    }

    public int getdia() {
        return this.dia;
    }

    public int getmes() {
        return this.mes;
    }

    public int getano() {
        return this.ano;
    }

    public int getdiaAux() {
        return this.dia;
    }

    public String getmesAux() {
        return this.mesAux;
    }
}
