public class Carro {
    private String modelo;
    private String placa;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;

    }

    public String getPlaca() {
        return this.placa;

    }

    public void setPlaca(String placa) {

        this.placa = placa;

    }

    public void setModelo(String placa) {
        this.modelo = modelo;
    }

}