package VehicleRentalSystem;

public interface VehicleRepository {
    void viewVehicles();
    boolean checkAvailability(String vinNumber);
    String setUnavailable(String vinNumber, boolean avalibility);
}
