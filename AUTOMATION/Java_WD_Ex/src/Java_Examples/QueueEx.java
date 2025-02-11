package Java_Examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll()); // 10 (Smallest element removed)
        
        System.out.println("Queue elements:  "+pq);
    }
}
