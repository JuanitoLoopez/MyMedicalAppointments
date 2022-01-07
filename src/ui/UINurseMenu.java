package ui;

import java.util.Scanner;

import static ui.UIMenu.*;

public class UINurseMenu {
    public static void showNurseMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Nurse");
            System.out.println("1. Watch appointment's list");
            System.out.println("2. Watch first appointment");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Watch appointment's list");
                    break;
                case 2:
                    System.out.println("::Watch first appointment");
                    break;
                case 0:
                    System.out.println();
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
}
