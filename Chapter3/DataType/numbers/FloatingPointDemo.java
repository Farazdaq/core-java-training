package Chapter3.DataType.numbers;

public class FloatingPointDemo {
     // Java treats decimal literals like 98.99 as double by default, and because converting a double to
     // a float may lose precision, it requires an explicit f suffix or cast (float).
    float marks = 98.99f;

    // Java automatically converts an int to a double because it is a safe widening conversion with no
    // loss of data, whereas converting a double to a float requires an explicit cast because it may lose precision.
    // or we call place the point and add d or D at the end
    double price1 = 956;
    double price2 = 956.2d;

    //java displays very small or very large double values in scientific notation to make them shorter and easier to read.
    // For example: 1.5E-19 means 1.5×10^(-19), which is equal to 0.00000000000000000015.
    double x = 0.00000000000000000015;

    //A float stores only about 7 decimal digits of precision, so any extra digits are rounded or discarded.
    //Therefore, 1.1234567124587f is stored and printed as 1.1234567 because the remaining digits cannot be represented accurately in a 32-bit float.
    float f = 1.1234567124587f;


    //A double provides about 15–17 significant decimal digits of precision, so digits beyond that limit cannot be stored exactly.
    //As a result, 1.1234567124584512452125411245125457d is rounded to the nearest representable value and prints as 1.1234567124584511.
    double d = 1.1234567124584512452125411245125457d;

    //BigDecimal stores decimal numbers with arbitrary precision, avoiding the rounding errors that can occur with float and double.
    //It is ideal for financial, scientific, and high-precision calculations where exact decimal values, such as currency amounts, must be preserved.

    double myHeight = 5.3d;

    public void displayHeight() {
        double result;
        result = myHeight*0.3048;
        System.out.println("Height in M:" + " " + result);
    }

    public void display() {
        System.out.println(marks);
        System.out.println(price1);
        System.out.println(price2);
        System.out.println(x);
        System.out.println(f);
        System.out.println(d);
    }
}

