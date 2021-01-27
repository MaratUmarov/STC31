
package part1.lesson12;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static Integer[] modiefedCreatedNumbers(int arrSize, int minValue, int maxValue) {
        /**
         * преобразование класса CreateNumArr в стрим Random из дз 8
         */
        int[] array = new Random ().ints ( arrSize, minValue, maxValue ).toArray ();
        /**
         * преобразование int в Integer для дальнейшего использования в программе
         */
        Integer[] workingNum = new Integer[array.length];
        Arrays.setAll ( workingNum, i -> array[i] );

        for ( Integer integer : workingNum ) {
            System.out.print ( integer+", " );
        }
        return workingNum;
    }

    public static void main(String[] args) {
        modiefedCreatedNumbers ( 50, 1, 50 );
    }
}
