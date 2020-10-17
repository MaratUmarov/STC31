package part1.lesson02.task01;

import java.io.IOException;

/**
 * @throws MyOwnException наследник IOException
 * @see IOException
 */
public class MyOwnException extends IOException {
    public MyOwnException(String message) {
        super(message);
    }

}
