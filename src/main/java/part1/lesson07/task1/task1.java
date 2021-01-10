package part1.lesson07.task1;

import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        WordLibrary wordLibrary = new WordLibrary ();
        System.out.println ( "enter words for words Library\n" + "after finishing enter empty line\n" );

        Scanner scan = new Scanner ( System.in );

        String t = scan.nextLine ();
        while(t != null && !t.isEmpty())
            wordLibrary.addWord ( t );

        try {
            wordLibrary.saveWords ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
