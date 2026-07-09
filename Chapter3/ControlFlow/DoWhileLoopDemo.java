package Chapter3.ControlFlow;
import java.util.Scanner;
public class DoWhileLoopDemo {
    public void balance() {
        double balance = 20;
        double payment = 5;
        double interestRate = 10; // 10% interest
        int years = 0;

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.printf("Year %d: Balance = %.2f%n", years, balance);
            System.out.print("Continue? (N to continue, any other key to stop): ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("N"));

        System.out.printf("Final Balance: %.2f%n", balance);
        System.out.println("Years: " + years);

        scanner.close();
    }


}
