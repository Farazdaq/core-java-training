package Chapter3.DataType.NonPrimitive;

public class StringDemo {
    public String text = "I am coming from the pool";
    String strObj = new String("I am coming from the heep");
    StringBuffer sb = new StringBuffer();

    public void  display () {
        System.out.println("This Text is Stored in the String Pool:"+ text);
        System.out.println("This Text is Stored in the String Heep:"+ strObj);
    }

    public  void getLength () {
        System.out.println("Text from the Pool length:" + " " + text.length());
        System.out.println("Text from the Heep length:" + " " + strObj.length());
    }

    public void getSecondLetter() {
        System.out.println("From the Pool my second letter is:" + " " + text.charAt(2));
        System.out.println("From the Heep my second letter is:" + " " + strObj.charAt(2));
    }

    public void getUpperCaseForm() {
        System.out.println("From the Pool, Here is my upperCase form:" + " " + text.toUpperCase());
        System.out.println("From the Heep, Here is my upperCase form:" + " " + strObj.toUpperCase());
    }

    public void modifyString (String text){
        System.out.println("original text:" + " " + sb);
        sb.append(text);
        System.out.println("text After change:" + " " + sb);
    }
}
