package part1.lesson03.task1;

import org.jetbrains.annotations.NotNull;

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
        System.out.println(
                "___________________________"
        );
        splitter(numbers);
        Set<Integer> set = new HashSet(Arrays.asList(numbers));
        for (Integer s : set)
            System.out.print(s + " ");
        System.out.println(
                "___________________________"
        );
        summator(set);
    }

    private static void summator(Set<Integer> set) {
        int d = set.stream().mapToInt((s) -> Integer.parseInt(valueOf(s))).sum();
        System.out.println(d);
    }

    private static void splitter(Number @NotNull [] numbers) {
        for (Number s : numbers) {
            double dev = (int) s / 3.0;
            System.out.printf("%2s%.2f\n", "  ", dev);
        }
    }

}
