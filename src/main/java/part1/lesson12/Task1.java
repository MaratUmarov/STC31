
package part1.lesson12;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static Integer[] modiefedCreatedNumbers(int arrSize, int minValue, int maxValue) {
        return
                new Random ()
                        .ints ( arrSize, minValue, maxValue )
                        .peek (System.out::println)
                        .boxed ()
                        .toArray ( Integer[]::new );
    }

    public static void main(String[] args) {
        modiefedCreatedNumbers ( 50, 1, 50 );
    }
}
