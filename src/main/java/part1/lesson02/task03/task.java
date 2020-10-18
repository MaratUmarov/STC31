package part1.lesson02.task03;

public class task {
    public static void main(String[] args) {
        PersonArrayGenerator testDataGenerator = new PersonArrayGenerator();
        Person[] personArray = testDataGenerator.createPersonArray();

        PersonSortable sortable = new SortFirstMethod();
        sortable.sortingPerson(personArray);

    }


}
