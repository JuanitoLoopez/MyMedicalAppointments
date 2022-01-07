package model;

public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email) {
        super(name,email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Trabajador del Hospital: San Sebastian");
        System.out.println("Departamento: Nutriología");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
