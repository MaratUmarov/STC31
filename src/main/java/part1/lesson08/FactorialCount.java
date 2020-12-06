package part1.lesson08;

import java.math.BigInteger;

public class FactorialCount {

    public BigInteger factorial(int d) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= d; ++i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}

