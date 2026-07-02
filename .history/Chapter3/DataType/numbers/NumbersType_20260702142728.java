package Chapter3.DataType.numbers;

public class NumbersType {
    byte numberByte = 20;
    short numberShort = 200;
    int numberInt = 4154751;
    long numberLong = 9000_000_000_000_000_000L ; 

    int maxValue = Integer.MAX_VALUE;
    int minValue = Integer.MIN_VALUE;

   public void displayNumbersTypes () {
     System.out.println("Byte" + numberByte );
     System.out.println("Short" + numberShort);
     System.out.println("Int" + numberInt);
     System.out.println("Max Value" + maxValue);
     System.out.println("Min Value" + minValue);
     System.out.println("Long" + numberLong);
     
    }

    public void wrapsAround () {
        byte a = 127;
        a = (byte)(a + 1);
        System.out.println(a);
    }


}
