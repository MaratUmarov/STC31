package part1.lesson03.task2;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox {
    Object obj;
    List<Object> mylist = new ArrayList<>();

    public ObjectBox(Object obj) {
        this.obj = obj;
    }

    /**
     * добавление элемента в коллекцию
     */
    public void addObject() {
        mylist.add(obj);
    }

    /**
     * удаление элемента из коллекции
     */
    public void deleteObject() {
        mylist.remove(obj);
    }

    /**
     * печать элементов коллекции
     */
    public void dump() {
        for (Object s : mylist
        ) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String toString() {
        return String.format("ObjectBox{mylist=%s}", mylist);
    }


}
