package part1.lesson08;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Factorial {

    private FactorialCount factorialCount = new FactorialCount();
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public BlockingQueue<BigInteger> calculateFactorials(Integer[] num) {
        BlockingQueue<BigInteger> bigIntegers = new LinkedBlockingQueue<>();

        for (Integer integer : num) {
            Runnable runnable = () -> {
                try {
                    BigInteger factorial = this.factorialCount.factorial(integer);
                    bigIntegers.put(factorial);
                    System.out.println(" факториал числа " + integer + "!= " + factorial);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executorService.submit(runnable);
        }

        return bigIntegers;
    }

}
