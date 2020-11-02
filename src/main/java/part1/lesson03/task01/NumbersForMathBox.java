package part1.lesson03.task01;

import java.util.Random;

public class NumbersForMathBox {
    Random random = new Random();

    public int numbersForMathBox() {

        return random.nextInt(100);
    }

    public MathBox[] createNumbersArray() {
        NumbersForMathBox mathBox1 = new NumbersForMathBox();
        MathBox[] numbers = new MathBox[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new MathBox(mathBox1.numbersForMathBox());
            System.out.println(numbers[i]);
        }
        return numbers;
    }
}

