package AOP;

public class LoggingAspect {
    public void before() {
        System.out.println("LOG: Method Is Starting...");

    }

    public void after() {
        System.out.println("LOG: Method Has Finished");
    }
}
