package part1.lesson02.task03;

public class Person {
    private final String name;
    private final String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                " sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
