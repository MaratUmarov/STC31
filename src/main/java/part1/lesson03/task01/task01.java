package part1.lesson03.task01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.valueOf;

public class task01 {
       public static void main(String[] args) {
        Number[] numbers = new MathBox().createNumbersArray();
        for (Number s : numbers
        ) {
            System.out.print(s + "  ");
        }
        System.out.println();
        for (Number s : numbers
        ) {
            double dev = (int) s / 3;
            System.out.print(dev + "  ");
        }
        System.out.println(
                "___________________________"
        );
        Set<Integer> set = new HashSet(Arrays.asList(numbers));
        for (Integer s : set
        )

            System.out.print(s + " ");
        System.out.println();

        System.out.println();
        int d = set.stream().mapToInt((s) -> Integer.parseInt(valueOf(s))).sum();
        System.out.println(d);

    }

}
