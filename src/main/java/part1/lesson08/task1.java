package part1.lesson08;

import java.math.BigInteger;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class task1 {
    public static void main(String[] args) {
        Integer[] num=new CreateNumArr().createNumbersArray();
        FactorialCount factorialCount=new FactorialCount();
        AtomicInteger count=new AtomicInteger(0);
        ThreadFactory threadFactory = Thread::new;
        ExecutorService executorService= Executors.newFixedThreadPool(10,threadFactory);
        BlockingDeque<BigInteger> bigIntegers=new LinkedBlockingDeque<>();

        for (Integer integer : num) {
            Runnable runnable=()->{
               count.incrementAndGet();
                BigInteger factorial = factorialCount.factorial(integer);
                bigIntegers.push(factorial);
                System.out.println(" факториал числа " + integer + "!= " + factorial);
                System.out.println(count.get()+"текущий поток");
                count.decrementAndGet();
            };
        executorService.submit(runnable);

        }
executorService.shutdown();
    }

}
