package CGLIB;

public class CGLIB {
    Enhancer enhancer = new Enhancer();

enhancer.setSuperclass(CarService.class);

enhancer.setCallback(
        new MethodInterceptor() {

        @Override
        public Object intercept(
                Object obj,
                Method method,
                Object[] args,
                MethodProxy methodProxy)
                throws Throwable {

            System.out.println("Before method");

            Object result =
                    methodProxy.invokeSuper(obj, args);

            System.out.println("After method");

            return result;
        }
    }
);

    CarService proxy =
            (CarService) enhancer.create();

proxy.serviceCar("VIN001");
}
