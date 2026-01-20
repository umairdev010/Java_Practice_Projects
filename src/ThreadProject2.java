public class ThreadProject2 {
    static void main(String[] args) throws InterruptedException {
        Thread task1 = new Thread(new Threadclass1(1));
        Thread task2 = new Thread(new Threadclass1(2));
        Thread task3 = new Thread(new Threadclass1(3));
        task1.start();
        task1.join();
        task2.start();
        task2.join();
        task3.start();
    }
}

class Threadclass1 implements Runnable{

    final int number;

    public Threadclass1(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("THREAD %d START",number);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("\nTHREAD %d IS RUNNING\n",number);
        }
        System.out.printf("THREAD %d IS STOPPED",number);
    }
}
