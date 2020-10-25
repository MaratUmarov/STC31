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
        Pair<Integer> upperCase = new Pair<>(65, 90);
        Pair<Integer> lowerCase = new Pair<>(lowerLimit, upperLimit);
        String name = getRandomChar(upperCase) +
                generateRandomString(length, lowerCase);
        return name;
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
     * @return people
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
