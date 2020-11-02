package part1.lesson03.task01;

import java.util.Random;

public class MathBox {
    Random random = new Random();

    public int numbersForMathBox() {

        return random.nextInt(100);
    }

    public Number[] createNumbersArray() {

        Number[] arr = new Number[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MathBox().numbersForMathBox();
           // System.out.println(arr[i]);
        }
        /*Number[] arr = new Number[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.println(arr[i]);
        }*/

        return arr;
    }
}

