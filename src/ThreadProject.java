public class ThreadProject {
    static void main(String[] args) {
        Threadclass task1 = new Threadclass(1);
        Threadclass task2 = new Threadclass(2);
        task1.start();
        task2.start();
    }
}

class Threadclass extends Thread{
    final int number;

    public Threadclass(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nI AM NO %d WORKING IN THREAD %s",number,Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
