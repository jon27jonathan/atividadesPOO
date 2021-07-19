
public class PessoaFisica extends Contato {
    private String nome;
    private String cpf;
    private String endereco;
    private String nascimento;

    public void Dados() {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public static void buscaPF(String cpf) {
        int cont = 0;
        String pessoaFisica = null;
        System.out.println("[Busca por CPF: " + cpf + "]");
        for (int i = 0; i < Agenda.agendaPF.size(); i++) {
            if (cpf == Agenda.agendaPF.get(i).getCpf()) {
                pessoaFisica = "Nome: " + Agenda.agendaPF.get(i).getNome() + "\nCPF: " + Agenda.agendaPF.get(i).getCpf()
                        + "\n" + "Endereço: " + Agenda.agendaPF.get(i).getEndereco() + "\nAniversário: "
                        + Agenda.agendaPF.get(i).getNascimento() + "\n";
                cont += 1;
            }
        }
        if (cont == 0) {
            System.out.println(pessoaFisica);
        } else {
            System.out.println("Pessoa física não encontrada.\n");
        }
    }
}
