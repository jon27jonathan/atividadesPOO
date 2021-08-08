public abstract class Construcao implements CarbonFootprint {
    private int nPessoas;
    private boolean usoDeEnergiaRenovavel;
    private int nLampadas;
    private boolean usoDoArCondicionado;

    public Construcao(int nPessoas, boolean usoDeEnergiaRenovavel, int nLampadas, boolean usoDoArCondicionado) {
        this.nPessoas = nPessoas;
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
        this.nLampadas = nLampadas;
        this.usoDoArCondicionado = usoDoArCondicionado;
    }

    public double getCarbonFootprint() {
        if (usoDeEnergiaRenovavel == true) {
            if (usoDoArCondicionado == true) {
                System.out.println("Tenham cuidado com o consumo do Ar");
                return nPessoas * nLampadas * 30;
            } else {
                System.out.println("Consumo Perfeito");
                return nPessoas * nLampadas * 15;
            }
        } else {
            if (usoDoArCondicionado == true) {
                System.out.println("Tenha cuidado com o Meio Ambiente...");
                return nPessoas * nLampadas * 50;
            } else {
                System.out.println("Uma possivel opção seria a energia renovável");
                return nPessoas * nLampadas * 25;
            }
        }
    }

}
