public enum DiaDaSemana {
    Domingo("domingo"), Segunda("segunda"), Terça("terça"), Quarta("quarta"), Quinta("quinta"), Sexta("sexta"),
    Sabado("sábado");

    private String nome;

    DiaDaSemana(String nome) {
        this.nome = nome;

    }

    public boolean eDiaUtil() {
        if ((this.ordinal() > 0) || (this.ordinal() > 5)) {
            return true;

        }
        return false;

    }
}
