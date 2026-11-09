package AOP;

public class Main {

    public  static void main(String[] args) {
        CarService readObject = new CarService();
        LoggingAspect aspect = new LoggingAspect();
        CarServiceProxy proxy = new CarServiceProxy(readObject, aspect);
        proxy.serviceCar("VIN001");



    }

}
