package part1.lesson13;

public class OutOfMemoryTestGC {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder ();

        while (true) {
            s.append ( "blockhead" );
        }
    }
}
