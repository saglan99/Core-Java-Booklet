package Queue;

import java.util.PriorityQueue;

public class hw3 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		
		PriorityQueue<Integer> pqr = new PriorityQueue<>();
		pqr.add(111);
		pqr.add(12);
		pqr.add(13);
		pqr.add(14);
		pqr.add(15);
		
		boolean a = pq.containsAll(pqr);
		
		System.out.println(a);

	}

}
