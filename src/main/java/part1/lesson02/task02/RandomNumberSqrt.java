package part1.lesson02.task02;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * программа вычисления квадратного корня для каждого члена рэндомного массива
 * и сспоставления по принципу если квадрат целочисленной части q^2 равен числу к извлекаемого кв корня
 * нужно его распечатать
 */
public class RandomNumberSqrt {
    public static void main(String[] args) {
        System.out.println("Введите число N кол-во случайных чисел");
        Scanner scan = new Scanner(System.in);
        /**
         *  inputArrayCount  ввод кол-ва элементов рэндомного массива
         */
        int inputArrayCount = scan.nextInt();
        try {
            if (inputArrayCount <= 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("число должно быть натуральным");
            return;
        }
        int[] array = new int[inputArrayCount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            try {
                int randomNumberMatch = random.nextInt();
                checkAccordance(randomNumberMatch);
                array[i] = random.nextInt();
                sqrtRandomNumber(array[i]);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    /**
     * проверка числа на отрицательное значение
     *
     * @param randomNumberMatch подставляем число для проверки
     * @throws Exception
     */
    private static void checkAccordance(int randomNumberMatch) throws Exception {
        if (randomNumberMatch < 0) {
            throw new Exception(String.valueOf(randomNumberMatch));
        }
    }
    /**
     * метод извлечения кв корня и сравнения с первоначальным числом к
     *
     * @param k число из массива , из которого ивлекают кв корень
     */
    private static void sqrtRandomNumber(int k) {
        double q = Math.sqrt(k);
        int modified = (int) q * (int) q;
        if (modified == k) {
            System.out.println(modified + "=" + k + "       equals");
        }
    }
}


