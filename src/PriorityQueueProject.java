import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProject {
    static void main(String[] args) {
        System.out.println("WELLCOME TO PRIORITY QUEUE PROJECT");
        Queue<Students> newQueue = new PriorityQueue<>(
                new Comparator<Students>() {
                    @Override
                    public int compare(Students o1, Students o2) {
                        return o2.marks - o1.marks;
                    }
                }
        );
        newQueue.offer(new Students("ali",75));
        newQueue.offer(new Students("umair",77));
        newQueue.offer(new Students("farhan",82));
        newQueue.offer(new Students("naveed",80));

        System.out.println(newQueue);
    }
}

class Students {
    String name;
    int marks;
    Students(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "name : " + name + " and " + "marks : " + marks;
    }
}
