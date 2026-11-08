package VehicleRentalSystem;

public interface RentalRepository {
    void saveRental(String vinNumber, String clientName, double amount);
}
