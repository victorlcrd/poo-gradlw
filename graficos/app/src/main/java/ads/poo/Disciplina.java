package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] diasDaSemana;

    public Disciplina(String sigla, DiasDaSemana[] diasDaSemana) {
        this.sigla = sigla;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplina{");
        sb.append("sigla='").append(sigla).append('\'');
        sb.append(", dias=").append(Arrays.toString(diasDaSemana));
        return sb.toString();
    }
}
