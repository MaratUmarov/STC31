package part1.lesson13;


public class OutOfMemoryTestGC {
    public static void main(String[] args) {
        integers ( 1000000000 );

    }

    private static Integer[] integers(int n) {
        Integer[] ints = new Integer[n];
        for ( int j = n ; j > n ; j-- ) {

            n = n * 100;
        }
        return ints;

    }
}

