package part1.lesson08;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

public class MainClass {
    public static void main(String[] args) {
        CreateNumArr createNumArr = new CreateNumArr();
        Integer[] numbersArray = createNumArr.createNumbersArray(50, 50);
        Factorial factorial = new Factorial();
        BlockingQueue<BigInteger> bigIntegers = factorial.calculateFactorials(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(bigIntegers);
    }
}

