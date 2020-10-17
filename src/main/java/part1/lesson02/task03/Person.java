package part1.lesson02.task03;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String sex,int age) {

    }
    public String getSex() {
        return sex;
    }
    public String setSex(String sex) {
        this.sex = sex;
        return sex;
    }
    public int getAge() {
        return age;
    }
   // public void setAge() {
   //     this.setAge(getAge());
  //  }


    public void setAge(int age) {
        this.age = age;
    }
}
