package part1.lesson02.task03;

public class task {
    public static void main(String[] args) {
        fillingPersonArrayMethod();

    }

    /**
     * в этом методе происходит наполнение массива Person
     */
    private static void fillingPersonArrayMethod() {
        FillPersonArray fpa = new FillPersonArray();
        Person person = new Person();
        Person[] people = new Person[10000];
        for (int i = 0; i < people.length; i++) {
            person.setSex(fpa.randSexForPerson());
            person.setName(fpa.randGetNameForPerson());
            person.setAge(fpa.randAgeSelect());
            people[i] = person;
            System.out.println(people[i].getSex() + "  " + people[i].getName() + "  " + people[i].getAge());

        }
    }
}
