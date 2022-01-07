package ui;

import model.Doctor;
import model.Nurse;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

import static ui.UIDoctorMenu.showDoctorMenu;
import static ui.UINurseMenu.showNurseMenu;
import static ui.UIPatientMenu.showPatientMenu;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre",
            "Octubre", "Nobieembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Nurse nurseLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona el tipo de perfil");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    response = 0;
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    System.out.println("Nurse");
                    authUser(2);
                    showPatientMenu();
                    break;
                case 3:
                    response = 0;
                    System.out.println("Patient");
                    authUser(3);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void authUser(int typeUser) {
        // Usuario Doctor 1
        // Usuario Nurse 2
        // Usuario Patien 3

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add( new Doctor("David Pacheco", "david@email.com"));
        doctors.add( new Doctor("Sandra Gomez", "sandra@email.com"));
        doctors.add( new Doctor("Ana Martinez", "ana@email.com"));

        ArrayList<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("Mario Roque", "mario@email.com"));
        nurses.add(new Nurse("Mardoqueo Lopez", "karla@email.com"));
        nurses.add(new Nurse( "Maribel Sosa", "jose@email.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Mario Roque", "maria@email.com"));
        patients.add(new Patient("Mardoqueo Lopez", "mardoqueo@email.com"));
        patients.add(new Patient("Maribel Sosa", "maribel@email.com"));

        // Validación de correo electrónico
        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [example@mail.com]");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            // Validación de tipo de usuario
            if(typeUser == 1) {
                for (Doctor doctor : doctors) {
                    if (doctor.getEmail().equals(email));
                    emailCorrect = true;
                    // Asignar los datos al usuario loggeado
                    doctorLogged = doctor;
                    // Mostrar Menu de doctor
                    showDoctorMenu();
                }
            }
            if(typeUser == 2) {
                for (Nurse nurse : nurses) {
                    if (nurse.getEmail().equals(email));
                    emailCorrect = true;
                    // Asignar los datos al usuario loggeado
                    nurseLogged = nurse;
                    // Mostrar Menu de Nurse
                    showNurseMenu();
                }
            }
            if(typeUser == 3) {
                for (Patient patient : patients) {
                    if (patient.getEmail().equals(email));
                    emailCorrect = true;
                    // Asignar los datos al usuario loggeado
                    patientLogged = patient;
                    // Mostrar Menu de Patient
                    showPatientMenu();
                }
            }
        } while (!emailCorrect);
    }
}
