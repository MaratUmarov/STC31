package part1.lesson03.task3;

import java.util.Random;

public class MathBox extends ObjectBox {
    Random random = new Random();

    public MathBox(Object obj) {
        super(obj);
    }

    public MathBox() {
        super();
    }

    public int numbersForMathBox() {

        return random.nextInt(100);
    }

    public Number[] createNumbersArray() {

        Number[] arr = new Number[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MathBox().numbersForMathBox();
        }
        return arr;

    }
}

