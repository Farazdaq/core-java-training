package AOP;

// Target Object: the original object being intercepted
public class CarService {
    public void serviceCar(String vinNumber){
        System.out.println("Servicing Car:" + vinNumber);
        System.out.println("Changing Oil...");
        System.out.println("Car Service Completed...");
    }
}
