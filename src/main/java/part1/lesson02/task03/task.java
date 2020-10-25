package part1.lesson02.task03;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        PersonArrayGenerator testDataGenerator = new PersonArrayGenerator();
        Person[] personArray = testDataGenerator.createPersonArray();

        SortFirstMethod sortable = new SortFirstMethod();
        Arrays.sort(personArray,SortFirstMethod.finalCompair);
        System.out.println("++++++++++++++++++++");
        for (Person str:personArray
             ) {
            System.out.println(str);
        }

    }


}
