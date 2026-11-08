package VehicleRentalSystem;

class Car {
    String name;
    String model;
    String vin;
    boolean availability;

     Car(String name, String model, String vin, boolean availability) {
        this.name = name;
        this.model = model;
        this.vin = vin;
        this.availability = availability;
    }
}
