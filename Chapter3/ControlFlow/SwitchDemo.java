package Chapter3.ControlFlow;

public class SwitchDemo {
    public void letsSwitch() {
        int choice = 2;

        switch (choice) {

            case 1 -> System.out.println("Home");

            case 2 -> System.out.println("Settings");

            case 3 -> System.out.println("Profile");

            default -> System.out.println("Invalid option");

        }
    }
}
