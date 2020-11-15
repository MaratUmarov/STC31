package part1.lesson05;

import java.util.Objects;

public class Animal {

    private final String name;
    private final String owner;
    private final Integer weight;

    public Animal(String name, String owner, int weight) {

        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +

                " onwer='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName()) &&
                Objects.equals(getOwner(), animal.getOwner()) &&
                Objects.equals(getWeight(), animal.getWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOwner(), getWeight());
    }
}


