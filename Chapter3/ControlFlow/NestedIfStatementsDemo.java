package Chapter3.ControlFlow;

public class NestedIfStatementsDemo {
    int age = 20;
    boolean hasLicense = true;

    public void checkLicence() {
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            }
        }
    }

}
