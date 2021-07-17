
public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String obterInfo() {
        return "Nome: " + nome + ";" + "Telefone: " + telefone + ";" + "Email: " + email;

    }

}