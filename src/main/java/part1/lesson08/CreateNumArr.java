package part1.lesson08;

import java.util.Random;

public class CreateNumArr {

    public Integer[] createNumbersArray(int arrSize, int minValue, int maxValue) {
        Integer[] arr = new Integer[arrSize];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[i] = new Random ().nextInt ( maxValue );
        }
        return arr;
    }
}

