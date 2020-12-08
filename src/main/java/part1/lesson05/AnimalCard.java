package part1.lesson05;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AnimalCard implements Id {
    Random random = new Random();
    Animal animal = new Animal("Bossy", "Steve", weightOfAnimal());

    /**
     *
     */
    Map<Id, Animal> mapAnimal = new HashMap<>();

    /**
     * случайный выбор веса Питомца
     *
     * @return вес животного
     */
    public int weightOfAnimal() {
        return random.nextInt(30);
    }

    /**
     * добавление питомца в картотеку
     */
    public void addAnimalCard() {
        mapAnimal.put(this, animal);
    }

    /**
     * поиск питомпца из картотеки по кличке
     */

    public void searchAnimalByName() {
    }

    /**
     * изменение данных животного в картотеке
     */
    public void changeDataOfAnimal() {

        mapAnimal.replace(this, (new Animal("asdfg", "Steve", weightOfAnimal())));
    }

    /**
     * распечатка отсортированного списка животных в картотеке
     */
    public void sortedDump() {

        mapAnimal.forEach((key, value) -> System.out.println(mapAnimal.entrySet()));
    }


    @Override
    public int getId() {
        return random.nextInt(100);

    }
}
