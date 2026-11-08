package VehicleRentalSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class CarRepository implements VehicleRepository {
    List<Car> cars = new ArrayList<>();
    Car car1 = new Car("Toyota", "Camry", "VIN001", false);
    Car car2 = new Car("BMW", "X5", "VIN002", true);
    Car car3 = new Car("Honda", "Civic", "VIN003", true);

    @Override
    public void viewVehicles() {
     System.out.println(car1.name + " | " + car1.model + " | " + car1.vin + " | " + car1.availability);
     System.out.println(car2.name + " | " + car2.model + " | " + car1.vin + " | " + car2.availability);
     System.out.println(car3.name + " | " + car3.model + " | " + car3.vin + " | " + car3.availability);
    }

    @Override
    public boolean checkAvailability(String vinNumber) {
        boolean avalibility = false;
     if (Objects.equals(vinNumber, car1.vin)){
         avalibility = car1.availability;
    }
    if(Objects.equals(vinNumber,car2.vin)) {
        avalibility = car2.availability;
    }
    if (Objects.equals(vinNumber,car3.vin)) {
        avalibility = car3.availability;
    }
        return avalibility;
    }

    @Override
    public String setUnavailable(String vinNumber, boolean avalibility) {
        String message = "Availability is Set";
        if (Objects.equals(vinNumber, car1.vin)){
            car1.availability =  avalibility;
        }
        if(Objects.equals(vinNumber,car2.vin)) {
            car2.availability =  avalibility;
        }
        if (Objects.equals(vinNumber,car3.vin)) {
            car3.availability =  avalibility;
        }
        return message;
    }
}
