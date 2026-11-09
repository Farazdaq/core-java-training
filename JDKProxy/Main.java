package JDKProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        CarService realObject = new CarServiceImpl();

        CarService proxy = (CarService) Proxy.newProxyInstance(
                CarService.class.getClassLoader(),
                new Class<?> [] {
                        CarService.class
                },
                new LoggingHandler(realObject)
        );
        proxy.serviceCar("VIN001");


    }
}
