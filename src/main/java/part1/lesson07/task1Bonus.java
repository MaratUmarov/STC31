package part1.lesson07;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_16;
import static java.nio.charset.StandardCharsets.UTF_8;

public class task1Bonus {
    public static void main(String[] args) {
/*
  Создание директории для файлов
  создание файлов для записи значений
 */
        File dir = new File("TestCode");
        boolean b = dir.mkdir();
        File basicText = new File(dir, "basicText.txt");
        File secondText = new File(dir, "secondText.txt");
        try {
            if (basicText.createNewFile()&&secondText.createNewFile ()) {
                System.out.println("ok");
            }
        } catch (IOException e) {
            e.getMessage();
        }

        String str = "пробуем поменять кодировку";
        try {
            if (basicText.createNewFile() || secondText.createNewFile())
                System.out.println("files had been created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
          запись и чтение из файла в разных кодировках
         */
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream(basicText), UTF_8))) {
            bw.write(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader in = new BufferedReader
                (new InputStreamReader(new FileInputStream(basicText)))) {
            try (BufferedWriter out = new BufferedWriter
                    (new OutputStreamWriter
                    (new FileOutputStream(secondText), UTF_16))) {

                while (in.ready()) {
                    String s = in.readLine();
                    out.write(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}