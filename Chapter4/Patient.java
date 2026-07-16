package Chapter4;

public class Patient {
    // Attributes (Data)
    private int patient_id;
    private String name;
    private int age;
    private String gender;



    // Methods (Behavior)
    private int phone_number;
    public void bookAppointment(){}
    public void cancelAppointment(){}
    public void register(){}
    public void viewDoctor(){}
    public void viewPrescription(){}

    public void consultDoctor(Doctor doctor) {
        doctor.diagnosePatient(this);
    }

    
    public String getName() {
        return name;
    }
}
