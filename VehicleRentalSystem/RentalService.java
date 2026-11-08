package VehicleRentalSystem;

public class RentalService {
    private final CarRepository carRepository;
    private final SMSService smsService;
    private final MySQLRentalRepository mySQLRentalRepository;
    public RentalService(CarRepository carRepository, SMSService smsService, MySQLRentalRepository mySQLRentalRepository){
        this.carRepository = carRepository;
        this.smsService = smsService;
        this.mySQLRentalRepository = mySQLRentalRepository;
    }
    public void rent(String vinNumber, String clientName, double amount) {
       boolean isCarAvailable = carRepository.checkAvailability(vinNumber);
       if(isCarAvailable) {
           System.out.println("Car is Available, For Rent");
           mySQLRentalRepository.saveRental(vinNumber, clientName, amount);
           carRepository.setUnavailable(vinNumber, false);
           smsService.sendSMS("Dear Customer, your vehicle with VIN: " + vinNumber + " has an outstanding amount of AED " + amount + ". Please complete your payment. Thank you.");
       } else {
           System.out.println("This Car with Vin Number" + vinNumber + "is not Available, now");
       }
    }
}
