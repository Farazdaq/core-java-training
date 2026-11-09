package JDKProxy;

public class CarServiceImpl implements CarService{

    @Override
    public void serviceCar(String vinNumber) {
        System.out.println("Servicing Car:" + vinNumber);
    }
}
