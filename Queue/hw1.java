package Queue;

import java.util.PriorityQueue;

public class hw1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		
		pq.clear();
		System.out.println(pq);

	}

}
