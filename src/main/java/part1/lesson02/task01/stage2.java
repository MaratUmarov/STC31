package part1.lesson02.task01;

import java.util.Random;

public class  stage2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length + 1; i++) {   //кол-во элементов больше обЪявленных
            array[i] = rnd.nextInt(15);

        }
        for (int s : array) System.out.println(s);

    }
}
