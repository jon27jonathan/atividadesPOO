public class EX5 {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.ligarTv();

        // subir 11 canais até o SBT
        for (int i = 0; i < 11; i++) {
            tv.subirCanal();
        }

        // aumentar até o volume 8
        while (tv.getVolume() < 8) {
            tv.aumentarVolume();
        }

        tv.mostarStatus();

        // descer até o 4 canal tv globo
        while (tv.getCanal() != 4) {
            tv.descerCanal();
        }

        // reduzir 3 pontos volume
        for (int i = 0; i < 3; i++) {
            tv.diminuirVolume();
        }

        tv.mostarStatus();
    }

}
