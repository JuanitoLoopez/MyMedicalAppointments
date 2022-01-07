package Introduction;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("Selecciona el número de la opción deseada.");
            System.out.println("1. Movies");
            System.out.println("2. Seires");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Buen viaje!");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona alguna opción del menu.");
            }
        } while ( response != 0);
    }
}
