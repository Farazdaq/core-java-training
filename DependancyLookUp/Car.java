package DependancyLookUp;

public class Car {
    public void startNavigation() {
        GPS gps =  ServiceLocator.getGPS();
        gps.navigate();
    }
}
