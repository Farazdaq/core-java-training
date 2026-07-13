package Chapter3.ControlFlow.Train;

public class SwitchTrain {

    public void getDayOfTheWeek() {
        int day = 2;
        switch (day) {
          case 1 -> System.out.println("Sunday");
          case 2 -> System.out.println("Monday");
          case 3 -> System.out.println("Tuesday");
          case 4 -> System.out.println("Wednesday");
          case 5 -> System.out.println("Thursday");
          case 6 -> System.out.println("Friday");
          case 7 -> System.out.println("Saturday");
          default -> System.out.println("oops");

        }
    }

    public void checkTraffikLight() {
        String sig = "green";
        switch(sig) {
        case "red" -> System.out.println("Stop");
        case "yellow" -> System.out.println("Be redy");
        case "green" -> System.out.println("Go");
            default -> System.out.println("Out of Service");

        }
    }

    public void calculate(int number1, char action, int number2){
        switch(action){
         case '*' -> System.out.println(number1 * number2);
         case '+' -> System.out.println(number1 + number2);
         case '-' -> System.out.println(number1 - number2);
            default -> System.out.println("Not supported action");
        }
    }
}
