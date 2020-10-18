package part1.lesson02.task03;

import java.util.Random;

public class FillPersonArray {

    Random random = new Random();

    /**
     * случайный выбор возраста Person
     *
     * @return возраст
     */
    public int randAgeSelect() {

        return random.nextInt(100);
    }

    /**
     * случайный выбор пола Person
     *
     * @return пол М или W
     */
    public String randSexForPerson() {
        String s = "W";
        int numForSelection = random.nextInt(2);
        if (numForSelection == 0) s = "M";
        return s;
    }

    /**
     * случайный выбор имени Person
     *
     * @return имя 7 букв
     */
    public String randGetNameForPerson() {
        int n = 7;
        int lowerLimit = 97;
        int upperLimit = 122;
        StringBuilder r = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int nextRandomChar = lowerLimit + (int) (random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char) nextRandomChar);
        }
        return r.toString();
    }

}
