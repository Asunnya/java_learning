public class ConversaoDeUnidadesDeArea {

    private static final double UM_METRO_PE_QUADRADO_MEDIDA = 10.76;
    private static final int UM_PE_CENTIMETROS_QUADRADO_MEDIDA = 929;
    private static final int UMA_MILHA_TO_ACRES_MEDIDA = 640;
    private static final double UM_ACRE_TO_PE_QUADRADO = 43.560;

    protected static double metroToPe(double metro) {
       return  metro * UM_METRO_PE_QUADRADO_MEDIDA;
    }

    protected static double peToMetro(double pe) {
        return UM_METRO_PE_QUADRADO_MEDIDA / pe;
    }

    protected static double centimetrosToPe(double centimetros) {
        return  centimetros * UM_PE_CENTIMETROS_QUADRADO_MEDIDA;
    }

    protected static double peToCentimetros(double pe) {
        return UM_PE_CENTIMETROS_QUADRADO_MEDIDA / pe;
    }

    protected static double milhaToAcre(double milha) {
        return  milha * UMA_MILHA_TO_ACRES_MEDIDA;
    }

    protected static double acreToMilha(double acre) {
        return UMA_MILHA_TO_ACRES_MEDIDA / acre;
    }

    protected static double acreToPe(double acre) {
        return  acre * UM_ACRE_TO_PE_QUADRADO;
    }

    protected static double peToAcre(double pe) {
        return UM_ACRE_TO_PE_QUADRADO / pe;
    }

}
