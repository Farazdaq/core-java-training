package Chapter3.InputOutput;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    String password;

    public void getInput() {
        System.out.println("Enter your password, please:");
        password = input.nextLine();
        System.out.println(password);
    }
}
