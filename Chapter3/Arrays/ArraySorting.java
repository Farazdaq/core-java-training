package Chapter3.Arrays;

import java.util.Arrays;

public class ArraySorting {
    int[] unSorted = {58, 6, 12, 3,18};
    public void sortArray() {
      Arrays.sort(unSorted);
        for(int sr : unSorted){
            System.out.println(sr);
        }
    }
}
