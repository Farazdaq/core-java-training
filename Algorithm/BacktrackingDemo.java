package Algorithm;

import java.util.Arrays;

public class BacktrackingDemo {
    int[] numbers = {-1, 0, 1, 2};
    int[] current = new int[3];

    public void getChoices() {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i +1; j < numbers.length; j++) {
                for(int k = j + 1; k < numbers.length; k++){
                    current[0] = numbers[i];
                    current[1] = numbers[j];
                    current[2] = numbers[k];

                    System.out.println(Arrays.toString(current));
                }
            }


        }
    }

}
