package part1.lesson02.task01;

import java.io.IOException;

class MyOwnException extends IOException {

    public MyOwnException(String s) {

    }
}

public class stage3 {

    public static void main(String[] args) {
        try {
            throw new MyOwnException("Бла Бла");

        } catch (MyOwnException e) {
            System.out.println("Произвольная ошибка " + e);
        }
    }
}
