package Chapter3.DataType.numbers;

public class NumbersType {
    byte numberByte = 20;
    short numberShort = 200;
    int numberInt = 4154751;
    int hexadecimal = 0x1A;
    int binary = 0b1010;
    int octal = 012;
    long numberLong = 9000_000_000_000_000_000L ; 

    int maxValue = Integer.MAX_VALUE;
    int minValue = Integer.MIN_VALUE;

   public void displayNumbersTypes () {
     System.out.println("Byte:" +" " + numberByte );
     System.out.println("Short:" +" " + numberShort);
     System.out.println("Int:" +" "+ numberInt);
     System.out.println("Hexadecimal:" +" "+ hexadecimal);
     System.out.println("Binary:"+" " + binary);
     System.out.println("Octal:"+" " + octal);
     System.out.println("Max Value:"+" " + maxValue);
     System.out.println("Min Value:"+" " + minValue);
     System.out.println("Long:"+" " + numberLong);
     
    }


// Wraps around: when an arithmetic result goes beyond the maximum or minimum value of a primitive type, it does not throw an error 
// (for most integer types). Instead, it wraps around using something called overflow behaviour.
    public void wrapsAround () {
        byte a = 127;
        a = (byte)(a + 1);
        System.out.println(a);
    }


}
