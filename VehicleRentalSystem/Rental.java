package VehicleRentalSystem;

public class Rental {
    String vinNumber;
    String clientName;
    double amount;
    public   Rental(String vinNumber, String clientName, double amount){
        this.vinNumber = vinNumber;
        this.clientName = clientName;
        this.amount = amount;
    }
}
