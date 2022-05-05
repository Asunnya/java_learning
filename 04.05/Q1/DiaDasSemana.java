package Q1;

public class DiaDasSemana {
    private enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }

    public static boolean ehDiaUtil(DiaDaSemana valor) {
        return valor != DiaDaSemana.DOMINGO && valor != DiaDaSemana.SABADO;
    }


}
