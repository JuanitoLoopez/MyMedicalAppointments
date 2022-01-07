package Introduction;

public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        while (isTurnOnLight) {
            printSOS();
        }

    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
