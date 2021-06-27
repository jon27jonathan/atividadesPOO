public class Agenda {

    private String nomeagenda;
    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(String nomeagenda) {
        this.nomeagenda = nomeagenda;
    }

    public String getNome() {
        return nomeagenda;
    }

    public void setNome(String nomeagenda) {
        this.nomeagenda = nomeagenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
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