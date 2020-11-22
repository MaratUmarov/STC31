package part1.lesson08;

import java.util.Arrays;

import static java.math.BigInteger.valueOf;

public class task1 {
    public static void main(String[] args) {
        Integer[] num=new CreateNumArr().createNumbersArray();
        FactorialCount factorialCount=new FactorialCount();

        Arrays.stream(num).map(d -> valueOf(factorialCount.factorial(d))).forEach(System.out::println);
    }

}
