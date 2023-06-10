import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueSol {
    public static void main(String[] args) {
        //creating the Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Inserting the elements into the Priority Queue
        pq.add(8);
        pq.add(12);
        pq.add(5);
        System.out.println(pq);
        //Using the peek method to get the front element.
        System.out.println("The front element is "+pq.peek());
        pq.add(10);
        pq.add(6);
        pq.add(3);
        //Creating an Iterator object to iterate over the queue elements.
        Iterator<Integer> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Removing elements using both poll() method and remove() method
        pq.poll();
        pq.remove();

        System.out.println("The Priority Queue after removal of elements"+pq);
    }
}
