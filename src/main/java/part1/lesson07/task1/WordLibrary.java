package part1.lesson07.task1;

import java.io.*;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

class WordLibrary {

    ArrayList<String> words = new ArrayList<> ();

    public void addWord(String t) {
        this.words.add ( t );
    }

    public void saveWords() throws IOException {
        File createWordsFile = new File ( "CreatedWordsFile.txt" );

        try {
            if (createWordsFile.createNewFile ()) {
                System.out.println ( "ok" );
            }
        } catch (IOException e) {
            e.getMessage ();
        }


        try {
            if (createWordsFile.createNewFile ())
                System.out.println ( "files had been created" );
        } catch (Exception e) {
            System.out.println ( e.getMessage () );
        }
        try (BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter
                ( new FileOutputStream ( createWordsFile ), UTF_8 ) )) {
            bw.write ( String.valueOf ( words ) );
        } catch (Exception e) {
            System.out.println ( e.getMessage () );
        }
    }
}




