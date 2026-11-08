package VehicleRentalSystem;

public class MySQLRentalRepository implements RentalRepository{
    @Override
    public void saveRental(String vinNumber, String clientName, double amount) {
        System.out.println("Rental,Saving...");
    }
}
