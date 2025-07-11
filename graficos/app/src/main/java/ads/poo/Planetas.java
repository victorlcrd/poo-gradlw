package ads.poo;

public enum Planetas {

    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private int posicao;

    Planetas (int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planetas{");
        sb.append("posicao=").append(posicao);
        sb.append('}');
        return sb.toString();
    }
}
