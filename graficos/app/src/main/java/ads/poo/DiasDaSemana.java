package ads.poo;

public enum DiasDaSemana {

    DOMINGO("Domingo"),
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("SEXta-feira"),
    SABADO("Sabado");

    private String nome;

    DiasDaSemana(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
