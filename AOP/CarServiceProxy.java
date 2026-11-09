package AOP;

public class CarServiceProxy {
    private CarService carService;
    private LoggingAspect loggingAspect;

    public CarServiceProxy(CarService carService, LoggingAspect loggingAspect) {
        this.carService = carService;
        this.loggingAspect = loggingAspect;
    }

    public  void serviceCar(String vinNumber) {
        loggingAspect.before();
        carService.serviceCar(vinNumber);
        loggingAspect.after();
    }
}
