package part1.lesson02.task02;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberSqrt {
    public static void main(String[] args) {
        System.out.println("Введите число N кол-во случайных чисел");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            if (n <= 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("число должно быть натуральным");
            return;
        }

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

            sqrtRandomNumber(array[i]);
        }
    }

    private static void sqrtRandomNumber(int a) {
        double q = Math.sqrt(a);
        int modified = (int) q * (int) q;
        if (modified == a) {
            System.out.println(modified + "=" + a + "       equals");
        }

    }
}


