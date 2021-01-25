package part1.lesson07.task1;

import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {
        WordLibrary wordLibrary = new WordLibrary ();
        WordReadingClass wordRidingClass = new WordReadingClass ();
        System.out.println ( "enter words for words Library\n" +
                "after finishing enter empty line\n" );
        Scanner scan = new Scanner ( System.in );
        String t = scan.nextLine ();
        while (! t.isEmpty ()) {
            wordLibrary.addWord ( t );
            t = scan.nextLine ();
        }
        try {
            wordLibrary.saveWords ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        wordRidingClass.wordReadingMethod ();

    }
}
