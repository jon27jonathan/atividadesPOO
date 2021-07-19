public class Pokemon {
    private String nome;
    private String tipo;
    private int hp;
    private int nivel;
    private String ataques[] = new String[4];

    public void pokemon(String nome, String tipo, int hp, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        this.nivel = hp;
    }

    public String[] getAtaque() {
        return ataques;
    }

    public void setAtaque(String[] ataques) {
        this.ataques = ataques;
    }

}
