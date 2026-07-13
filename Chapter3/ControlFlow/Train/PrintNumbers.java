package Chapter3.ControlFlow.Train;
import java.util.Scanner;
public class PrintNumbers {

  public void  getPrintedNumber() {
      for(int i =1; i <= 10; i++) {
          System.out.println(i);
      }
  }

  public void printEvenNumbers() {
      for(int i = 2; i <= 20; i++) {
          if( i % 2 == 0) {
              System.out.println(i);
          }
      }
  }

  public void printOddNumbers() {
      for(int i = 1; i <= 20; i++) {
          if(i % 2 != 0) {
              System.out.println(i);
          }
      }
  }

  public  void reverseCounting () {
      for(int i = 10; i >= 1; i--) {
          System.out.println(i);
      }
  }

  public void multiplicationTable() {
      int number ;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number:");
      number = Integer.parseInt(input.nextLine());
      for(int i = 1; i <= 50; i++){
          System.out.println(i * number);
      }
  }

  public void sumOfNumbers() {
      int sum = 0;
      for (int i = 1; i <=100; i++){
       sum  += i;
      }

      System.out.println(sum);

  }

  //--------------While Loop----------------------
    public void printNumberWhile() {
      int number= 0;
      while(number <= 20){
          System.out.println(number);
          number++;
      }
    }

    public void printNumberReversed()
    {
        int number = 10;
        while(number >= 1){
            System.out.println(number);
            number--;
        }
    }

    public void printEvenWhile()
    {
        int even = 0;
        while(even <= 50 && even % 2 ==0){
            System.out.println(even);
            even++;
        }
    }
}
