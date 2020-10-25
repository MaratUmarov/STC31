package part1.lesson02.task03;

public class Pair<T extends Number> {
    public final T first;
    public final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
