package EX1;

public class Agenda {

    private String nomeagenda;
    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(String nomeagenda) {
        this.nomeagenda = nomeagenda;
    }

    public String getnome() {
        return nomeagenda;
    }

    public void setnome(String nomeagenda) {
        this.nomeagenda = nomeagenda;
    }

    public Contato[] getcontatos() {
        return contatos;
    }

    public void setcontatos(Contato[] contatos) {
        this.contatos = contatos;

    }

    public String obterInfo() {
        String info = "Nome: " + nomeagenda + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }

        }

        return info;
    }

}