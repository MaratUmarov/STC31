package part1.lesson08;

import java.util.Random;

/**
 * TODO переписать класс на стрим
 */
public class CreateNumArr {
    Random random = new Random();

    public int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public Integer[] createNumbersArray(int arrSize, int maxValue) {
        Integer[] arr = new Integer[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomInt(maxValue);
        }
        return arr;
    }
}

