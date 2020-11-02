package part1.lesson02.task03;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class task {
    public static void main(String[] args) {

        Person[] personArray = new PersonArrayGenerator().createPersonArray();
        long executingTime = System.currentTimeMillis();
        Arrays.sort(personArray, SortFirstMethod.finalCompair);
        System.out.println("++++++++++++++++++++");
        for (Person str : personArray
        ) {
            System.out.println(str);
        }
        executingTime = System.currentTimeMillis() - executingTime;
        System.out.println(executingTime);

        SortSecondMethod.secondSort(personArray);
    }



}
