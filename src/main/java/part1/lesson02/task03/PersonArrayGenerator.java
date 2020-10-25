package part1.lesson02.task03;

import java.util.Random;

public class PersonArrayGenerator {

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
        int lowerLimit = 97;
        int upperLimit = 122;

        int length = 7;
        StringBuilder name = new StringBuilder();
        Pair<Integer> upperCase = new Pair(23, 45);
        Pair<Integer> lowerCase = new Pair(lowerLimit, upperLimit);
        name.append(getRandomChar(upperCase));
        name.append(generateRandomString(length, lowerCase));
        return name.toString();
    }

    private String generateRandomString(int length, Pair<Integer> charCase) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < length; i++) {
           line.append(getRandomChar(charCase));
        }
        return line.toString();
    }

    private char getRandomChar(Pair<Integer> charCase) {
        int nextRandomChar = charCase.first + (int) (random.nextFloat()
                * (charCase.second - charCase.first + 1));
        return (char) nextRandomChar;
    }

    /**
     * в этом методе происходит наполнение массива Person
     * @return
     */
    public Person[] createPersonArray() {
        PersonArrayGenerator fpa = new PersonArrayGenerator();
        Person[] people = new Person[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(fpa.randGetNameForPerson(), fpa.randSexForPerson(), fpa.randAgeSelect());
            System.out.println(people[i]);
        }
        return people;
    }

}
