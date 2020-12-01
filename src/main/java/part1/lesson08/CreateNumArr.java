package part1.lesson08;

import java.util.Random;

public class CreateNumArr {
    Random random = new Random();

    public int createNumArr() {
        return random.nextInt(50);
    }

    public Integer[] createNumbersArray() {
        Integer[] arr = new Integer[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new CreateNumArr().createNumArr();

        }
        return arr;
    }
}

