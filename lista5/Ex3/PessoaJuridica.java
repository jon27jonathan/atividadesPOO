public class PessoaJuridica extends Contato {
    public String razaoSocial;
    public String cnpj;
    public String endereco;
    public String faturamento;

    public void Dados() {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.faturamento = faturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public static void buscaPJ(String CNPJ) {
        int cont = 0;
        String pessoaJuridica = null;
        System.out.println("[BUSCA POR CNPJ: " + CNPJ + "]");
        for (int i = 0; i < Agenda.agendaPJ.size(); i++) {
            if (CNPJ == Agenda.agendaPJ.get(i).getCnpj()) {
                pessoaJuridica = "Razão social: " + Agenda.agendaPJ.get(i).getRazaoSocial() + "\nCNPJ: "
                        + Agenda.agendaPJ.get(i).getCnpj() + "\n" + "Endereço: " + Agenda.agendaPJ.get(i).getEndereco()
                        + "\nFaturamento: " + Agenda.agendaPJ.get(i).getFaturamento() + "\n";
                cont += 1;
            }
        }
        if (cont == 1) {
            System.out.println(pessoaJuridica);
        } else {
            System.out.println("Pessoa jurídica não encontrada.");
        }
    }

}
