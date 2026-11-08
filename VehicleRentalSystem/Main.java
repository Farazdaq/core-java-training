package VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        SMSService smsService = new SMSService();
        MySQLRentalRepository mySQLRentalRepository = new MySQLRentalRepository();
        RentalService rentalService = new RentalService(carRepository, smsService, mySQLRentalRepository);
        rentalService.rent("VIN002", "Farazdaq" ,8.000);
    }

}
