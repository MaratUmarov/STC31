package part1.lesson07.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WordReadingClass {
    String filename = "CreatedWordsFile.txt";

    private static String readUsingFiles(String fileName) throws IOException {
        return new String ( Files.readAllBytes ( Paths.get ( fileName ) ) );
    }

    public void wordReadingMethod() {
        try {
            String s = readUsingFiles ( filename ).toLowerCase ();
            List<String> readyToWorkString = Arrays.stream ( s.split ( "[\\[,\\]]+" ) )
                    .distinct ().sorted ().collect ( Collectors.toList () );
            readyToWorkString.forEach ( System.out::println );
            File modifiedWords = new File ( "ModifiedWords.txt" );
            try {
                if (modifiedWords.createNewFile ())
                    System.out.println ( "files had been created" );
            } catch (Exception e) {
                System.out.println ( e.getMessage () );
            }
            try (
                    BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter
                            ( new FileOutputStream ( modifiedWords ), UTF_8 ) )) {
                bw.write ( String.valueOf ( readyToWorkString ) );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }


}
