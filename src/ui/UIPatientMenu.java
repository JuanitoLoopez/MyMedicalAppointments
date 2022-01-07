package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static ui.UIDoctorMenu.*;
import static ui.UIMenu.*;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientAppointments();
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println(":: Book and appointment");

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;

            for (int i = 0; i < doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int dateSelectedResponse = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(dateSelectedResponse);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doctor:doctorAvailableSelected.entrySet()) {

                indexDate = doctor.getKey();
                doctorSelected = doctor.getValue();

            }

            System.out.println(doctorSelected.getName() + ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Book");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {

                patientLogged.addAppointmentDoctors(doctorSelected,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }
            System.out.println("0. Return");
        } while (response != 0);
    }

    private static void showPatientAppointments() {
        int response = 0;
        do {
            System.out.println("::My appointments");
            if (patientLogged.getAppointmentDoctors().size() > 0) {
                System.out.println("::Doctor Appointments");
                for (int i = 0; i < patientLogged.getAppointmentDoctors().size(); i++) {
                    int j = i + 1;
                    System.out.println(j + ". " + "Date: " + patientLogged.getAppointmentDoctors().get(i).getDate() + " Time: " + patientLogged.getAppointmentDoctors().get(i).getTime() + "\n Doctor: " + patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
                }
            } else if (patientLogged.getAppointmentNurses().size() > 0) {
                System.out.println("::Nurse Appointments");
                for (int i = 0; i < patientLogged.getAppointmentNurses().size(); i++) {
                    int j = i + 1;
                    System.out.println(j + ". " + "Date: " + patientLogged.getAppointmentNurses().get(i).getDate() + " Time: " + patientLogged.getAppointmentNurses().get(i).getTime() + "\n Doctor: " + patientLogged.getAppointmentNurses().get(i).getNurse().getName());
                }
            } else {
                System.out.println("Don't have appointments");
                break;
            }
            System.out.println("0. Return");
        } while (response != 0);
    }
}
