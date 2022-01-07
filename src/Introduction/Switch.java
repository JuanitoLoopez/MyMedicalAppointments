package Introduction;

public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Has seleccionado Ligth Mode");
                break;
            case "Night":
                System.out.println("Has seleccionado Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Has seleccionado Blue Dark Mode");
                break;
            case "Blue":
                System.out.println("Has seleccionado Blue Mode");
                break;
            case "Dark":
                System.out.println("Has seleccionado Dark Mode");
                break;
            default:
                System.out.println("Selecciona un modo valido.");
                break;

        }
    }
}
