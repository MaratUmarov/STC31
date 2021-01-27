package part1.lesson08;

import java.math.BigInteger;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {
    public static void main(String[] args) {
        // Integer[]num= part1.lesson12.Task1.modiefedCreatedNumbers ( 50,1,50 );
        CreateNumArr createNumArr = new CreateNumArr ();
        Integer[] num = createNumArr.createNumbersArray ( 50, 1, 50 );
        FactorialCount factorialCount = new FactorialCount ();
        AtomicInteger count = new AtomicInteger ( 0 );
        ExecutorService executorService = Executors.newFixedThreadPool ( 10 );
        BlockingDeque<BigInteger> bigIntegers = new LinkedBlockingDeque<> ();
        factorialCalculate ( num, factorialCount, count, executorService, bigIntegers );
    }

    private static void factorialCalculate(Integer[] num, FactorialCount factorialCount, AtomicInteger count, ExecutorService executorService, BlockingDeque<BigInteger> bigIntegers) {
        for ( Integer integer : num ) {
            Runnable runnable = () -> {
                count.incrementAndGet ();
                BigInteger factorial = factorialCount.factorial ( integer );
                bigIntegers.push ( factorial );
                System.out.println ( " факториал числа " + integer + "!= " + factorial );
                System.out.println ( count.get () + "текущий поток" );
                count.decrementAndGet ();
            };
            executorService.submit ( runnable );

        }

        executorService.shutdown ();
    }

}

