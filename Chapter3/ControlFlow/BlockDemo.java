package Chapter3.ControlFlow;

public class BlockDemo {
    int number = 5;
    {
        int result = number * 5 ;
        System.out.println(result);

        {
            //nested block
            System.out.println(result);
        }


    }
     // After } if we try to access:
     // System.out.println(result);
     // will not be able to access  as it is inside another block where  result is defined and living
}
