package EX5;

public class TV {
    private int canal = 0;
    private int volume = 0;
    private boolean ligado;

    public void aumentarVolume() {
        if (ligado) {
            if (volume < 10) {
                volume++;
            }
        }
    }

    public void diminuirVolume() {
        if (ligado) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void subirCanal() {
        if (ligado) {
            if (canal < 99) {
                canal++;
            }
        }
    }

    public void descerCanal() {
        if (ligado) {
            if (canal > 0) {
                canal--;
            }
        }
    }

    public void ligarTv() {
        ligado = true;
    }

    public void desligarTv() {
        ligado = false;
    }

    public void mostarStatus() {
        if (ligado) {
            System.out.println("Esta no canal " + canal + ", no volume " + volume + " e a TV esta ligado.");
        } else {
            System.out.println("A TV esta desligado.");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
