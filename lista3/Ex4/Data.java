package Ex4;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesAux;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, String mesAux, int ano) {
        this.dia = dia;
        this.mesAux = mesAux;
        this.ano = ano;
    }

    public Data(int dia, int ano) {
        this.dia = dia;
        this.ano = ano;
    }

    public void setdia(int dia) {
        this.dia = dia;
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

    public String getmesAux() {
        return this.mesAux;
    }
}
