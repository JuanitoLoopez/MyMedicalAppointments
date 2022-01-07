package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

    // Metodos constructores de la clase model.Doctor
    public Doctor(String name, String email){
        super(name,email);
//        System.out.println("El nombre " + "del model.Doctor asignado es: " + name );
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointments(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "model.Doctor { " +
                "speciality='" + speciality + "\n" +
                ", availableAppointments=" + availableAppointments +
                " } ";
    }

    @Override
    public void showDataUser() {
        System.out.println("Trabajador del Hospital: San Sebastian");
        System.out.println("Departamento: Cancerología");
    }

    // Clase Anidada
    public static class AvailableAppointment {
        // Atributos de la clase anidada
        int idAA;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // Constructor de la clase anidada
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        // Getters y Setters de la clase anidada
        public int getIdAA() {
            return idAA;
        }
        public void setIdAA(int idAA) {
            this.idAA = idAA;
        }
        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return super.toString() + "AvailableAppointment { " +
                    "idAA=" + idAA + "\n" +
                    ", date=" + date + "\n" +
                    ", time='" + time +
                    " } ";
        }
    }
}
