package part1.lesson02.task01;


public class stage3 {

    public static void main(String[] args) {

        throwMyOwnException();

    }

    /**
     * метод выброса собственного исключения
     *
     * @throws MyOwnException наследуется от IOException
     * @see java.io.IOException
     */
    private static void throwMyOwnException() {
        try {
            throw new MyOwnException("my own Exception thrown");
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
