import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorProject1 {
    static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        PrintingCounting task = new PrintingCounting();

        executor.submit(task);

        executor.shutdown();

    }
}

class PrintingCounting extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("wellcome to the counting : " + i);
        }
    }
}
