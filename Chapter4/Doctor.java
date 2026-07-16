package Chapter4;

public class Doctor {

    // Attributes (Data)
    private int doctor_id;
    private String name;
    private String experience;
    private String specialization;
    private boolean availability;




    // Methods (Behavior)
    public void diagnosePatient(Patient patient) {
        System.out.println(
                "Dr. " + name +
                        " is diagnosing " +
                        patient.getName()
        );
    }
    
    public void prescribeMedicine(){}
    public void updateAvailability(){}
    public void viewPatient(){}


}
