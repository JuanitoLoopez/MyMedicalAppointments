package Introduction;

public class Family {
    public static void main(String[] args) {
        // EJERCICIO 1

        String text = "Esta es una lista de datos relacionado con mi familia. " +
                "Utilizando distintos tipos de datos.";
        boolean myFamilyHaveAPet = true;
        byte myDadAge = 60;
        short myMomAge = 61;
        char theFirstLetterOfMomsName = 'A';
        int mySisterAge = 32;
        long myGrandmaAge = 83;
        float myExamGrade = 9.5f;
        double myBrotherExamGrade = 92.5;


        // EJERCICIO 2

        char i1 = 'z'; // conviertelo a int
        int ac = i1;
        System.out.println(ac); // implicito

        int i2 = 250; //conviertelo a long y luego de long a short
        long ba = i2;
        System.out.println(ba); // implicito
        short bb = (short) ba;
        System.out.println(bb); // explicito

        double i3 = 301.067; //conviertelo a long
        long ca = (long) i3;
        System.out.println(ca); // explicito

        int i4 = 100; //súmale 5000.66 y conviertelo a float
        float da = (float) (i4 + 5000.66);
        System.out.println(da); // implicito

        int i5 = 737; //multiplícalo por 100 y conviertelo a byte
        byte ea = (byte) i5;
        System.out.println(ea); // explicito

        double d = 298.638; //divídelo entre 25 y conviertelo a long
        long fa = (long) d / 25;
        System.out.println(fa); // explicito

        // EJERCICIO 3
        /*Explica cómo distribuirías y crearías un ambiente de producción para un programa compilado
            con la versión 9 de Java.Incluye al menos dos Sistemas Operativos.*/

        /*
        * Paso uno configurar los JDK en los respectivos sitemas operativos
        * Paso dos crear archivos jar en Java versión 9
        * Paso tres configurar el java_HOME en el sistema operativo que sera distribuido
        * Paso cuatro ejecutar el sistema en Java version 9 o superiores
        * */
    }
}
