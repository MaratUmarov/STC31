package part1.lesson02.task03;

import java.util.Comparator;

public class SortFirstMethod implements PersonSortable {



   // public void sortingPerson(Person[] personArray) {
       public static Comparator<Person>comparSex=Comparator.comparing(person -> person.getSex());
     public static    Comparator<Person>comparName=comparSex.thenComparing(person -> person.getName());
      public static   Comparator<Person>finalCompair=comparName.thenComparing(person -> person.getAge());

    @Override
    public void sortingPerson(Person[] personArray) {

    }
    //}
}
