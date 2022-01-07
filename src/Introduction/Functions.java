package Introduction;

public class Functions {
    public static void main(String[] args) {
        double y = 3;
        // Area del circulo PI * r2
        double cArea = circleArea(y);
        System.out.println(cArea);
        // Area de una esfera 4PI * r2
        System.out.println(sphereArea(y));
        // Volumen de una esfera
        // Area de una esfera (4/3) * PI * r2
        System.out.println(sphereVolume(y));

        System.out.println("De pesos Mexicanos a dolarés " + convertToDollar(40, "MXN"));
        System.out.println("De pesos Colombianos a dolarés " + convertToDollar(8500, "COP"));
    }

    /**
     * <h3>Descripción:</h3>
     * <p></p>Esta funcion nos permite obtener el Area de un circulo.</p>
     * <p>Únicamente ingresando el <strong>radio</strong> como parametro.</p>
     * @param r Radio del circulo
     * @return El resultado de la operacion matemática para calcular el área de un circulo.
     * @autor Indica el autor de la clase
     * @exception x Maneja excepciones
     * @throws x Sinonimo de exception
     * @see x Se añade para manejar referencias o información relacionada
     * @since Se añade en el encabezado para especificar desde cuándo fue creado.
     * @version Se añade en el subtitulo de la versión especificada.
     * */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolume(double r) {
        return 4/3 * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Esta función nos permite realizar una conversión de monedas.
     *      Debes ingresar la cantidad y tipo de moneda para realizar la conversión.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda. Solo acepta Pesos Mexicano (MXN) y Pesos Colombianos (COP).
     * @return quantity Devuelve la cantidad actualizada en Dólares
     * */
    public static double convertToDollar (double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.047;
                break;
            case "COP":
                quantity = quantity * 0.00025;
                break;
        }
        return quantity;
    }
}
