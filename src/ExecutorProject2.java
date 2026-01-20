import java.util.concurrent.*;

public class ExecutorProject2 {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        PrintFactorial task1 = new PrintFactorial(5);
        PrintFactorial task2 = new PrintFactorial(10);
        PrintFactorial task3 = new PrintFactorial(8);

        Future<Long> result1 = executor.submit(task1);
        Future<Long> result2 = executor.submit(task2);
        Future<Long> result3 = executor.submit(task3);


        System.out.printf("THE FACTORIA OF 5 IS = %d",result1.get());
        System.out.printf("\nTHE FACTORIA OF 10 IS = %d",result2.get());
        System.out.printf("\nTHE FACTORIA OF 8 IS = %d",result3.get());

        executor.shutdown();

    }
}

class PrintFactorial implements Callable<Long>{

    private int number ;

    public PrintFactorial(int number) {
        this.number = number;
    }


    @Override
    public Long call() throws Exception {
        Long result = (long) 1;
        for(int i = 1; i < number ; i++){
            result *= i;
        }
        return result;
    }
}
