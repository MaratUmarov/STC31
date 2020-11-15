package part1.lesson03.task2;

public class task2 {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox("foo");
        objectBox.addObject();
        ObjectBox objectBox1 = new ObjectBox(12);
        objectBox1.addObject();
        objectBox.dump();
        objectBox1.dump();
        System.out.println("_____________________");
        objectBox.deleteObject();
        objectBox.dump();
        objectBox1.dump();

    }
}
