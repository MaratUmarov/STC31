package part1.lesson02.task03;

public class task {
    public static void main(String[] args) {
        FillPersonArray fpa=new FillPersonArray();
        Person person=new Person();
        Person[] people=new Person[10000];
        for (int i = 0; i <people.length ; i++) {
            person.setSex(fpa.randSexForPerson());
            person.setAge(fpa.ageRandSelect());
            people[i]=person;
      // fpa.ageRandSelect();
        System.out.println(people[i].getAge()+"  "+people[i].getSex());
    }

}}
