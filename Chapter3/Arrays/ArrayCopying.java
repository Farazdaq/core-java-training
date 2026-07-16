package Chapter3.Arrays;

import java.util.Arrays;

public class ArrayCopying {

    int[] numbers = {4, 68 , 5, 4};

    public void copyTheArray() {
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        int[] cloneCopy = numbers.clone();
        for(int num: numbersCopy){
            System.out.println(num);
        }
    }

}
