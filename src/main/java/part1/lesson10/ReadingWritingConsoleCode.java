package part1.lesson10;

import java.io.IOException;
import java.util.Scanner;

public class ReadingWritingConsoleCode implements Worker {
    @Override
    public void doWork() {
        CreateSomeLoader createSomeFile = new CreateSomeLoader ();
        Scanner scan = new Scanner ( System.in );
        String t = scan.nextLine ();
        while (! t.isEmpty ()) {

            t = scan.nextLine ();
        }
     /*   try {

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }*/
    }
}