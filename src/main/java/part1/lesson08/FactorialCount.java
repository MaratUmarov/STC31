package part1.lesson08;

public class FactorialCount {

    public Integer factorial(int d) {
        int res = 1;
        for (int i = 1; i <= d; ++i) {
            res *= i;
        }
        return res;
    }
}

