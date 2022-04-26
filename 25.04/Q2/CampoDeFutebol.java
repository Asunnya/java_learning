public class CampoDeFutebol {
    private static final double AREA_CAMPO_EM_METROQ2 = 8.250;


    public static void imprimirCampoDeFutebol() {
        double peQuadrado = ConversaoDeUnidadesDeArea.metroToPe(AREA_CAMPO_EM_METROQ2);
        double acre = ConversaoDeUnidadesDeArea.peToAcre(peQuadrado);
        double cent = ConversaoDeUnidadesDeArea.peToCentimetros(peQuadrado);

        System.out.println("AREA EM PES QUADRADOS: " + peQuadrado);
        System.out.println("AREA EM ACRES: " + acre);
        System.out.println("AREA EM CENTIMETROS QUADRADOS: " + cent);

    }
}
