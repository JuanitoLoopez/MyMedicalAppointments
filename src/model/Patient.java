package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    // Constructor
    public Patient(String name, String email) {
        super(name,email);
    }

    // Getter Y Setters

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void addAppointmentNurses(Nurse nurse, Date date, String time) {
        AppointmentNurse appointmentNurse = new AppointmentNurse(this, nurse);
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getHeight(){
        return this.height + " Mts.";
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Métodos
    public static void showPatient(){
        System.out.println("Hi model.Patient");
    }

    @Override
    public String toString() {
        return super.toString() + "model.Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente del Hospital: ");
    }
}
