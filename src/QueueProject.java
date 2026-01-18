import java.util.LinkedList;
import java.util.Queue;

public class QueueProject {
    static void main(String[] args) {
        System.out.println("WELLCOME TO LEARNING QUEUE.");
        Queue<String> listOfTasks = new LinkedList<>();
        listOfTasks.offer("counting books");
        listOfTasks.offer("counting apples");
        listOfTasks.offer("counting glass");
        listOfTasks.offer("counting flowers");
        System.out.println(listOfTasks.peek());
        System.out.println(listOfTasks.poll());
        System.out.println(listOfTasks.poll());
        System.out.println(listOfTasks.poll());
        System.out.println(listOfTasks.poll());
        System.out.println(listOfTasks.poll());
        System.out.println(listOfTasks.poll() == null);
        System.out.println(listOfTasks);
    }
}
