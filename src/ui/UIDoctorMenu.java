package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIMenu.*;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. Watch appointment's list");
            System.out.println("3. Watch first appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    System.out.println("::Watch appointment's list");
                    break;
                case 3:
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

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;

                System.out.println(j + ". " + MONTHS[i]);
            }
            System.out.println("0. Return ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4) {
                int monthSelected;
                monthSelected = response;
                System.out.println(monthSelected + " . " + MONTHS[monthSelected-1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1.Correct \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());

                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [HH:mm]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1.Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime == 2);

                doctorLogged.addAvailableAppointments(date, time);
                checkDoctorAvailableAppointment(doctorLogged);

            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
