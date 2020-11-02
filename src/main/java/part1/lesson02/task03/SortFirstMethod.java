package part1.lesson02.task03;

import java.util.Comparator;

public class SortFirstMethod implements PersonSortable {

    // public void sortingPerson(Person[] personArray) {
    public static Comparator<Person> compairSex = Comparator.comparing(Person::getSex);
    public static Comparator<Person> compairName = compairSex.thenComparing(Person::getName);
    public static Comparator<Person> finalCompair = compairName.thenComparing(Person::getAge);


    @Override
    public void sortingPerson(Person[] personArray) {

    }
    //}
}
