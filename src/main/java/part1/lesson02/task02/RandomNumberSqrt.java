package part1.lesson02.task02;

import java.util.Scanner;

public class RandomNumberSqrt {
    public static void main(String[] args) {
        System.out.println("Введите число N кол-во случайных чисел");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            if (n <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("число должно быть натуральным");
        }




    }
}
