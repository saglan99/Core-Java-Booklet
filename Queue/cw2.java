package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class cw2 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
