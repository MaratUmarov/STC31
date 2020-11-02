package part1.lesson02.task03;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class SortSecondMethod implements PersonSortable {

    public static void secondSort(Person[] personArray) {
        long executingTime;
        executingTime = System.currentTimeMillis();
        System.out.println("-----------------------");
        Collection<Person> peoples = Arrays.asList(personArray);
        Collection<Person> bySexAndAge = peoples.stream().sorted((o1, o2) -> o1.getSex() != o2.getSex() ? o1.getSex().
                compareTo(o2.getSex()) : o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        for (Person s : bySexAndAge
        ) {

            System.out.printf("%-20s%n", s);
        }

        executingTime = System.currentTimeMillis() - executingTime;
        System.out.println(executingTime);
    }

    @Override
    public void sortingPerson(Person[] personArray) {

    }


}
