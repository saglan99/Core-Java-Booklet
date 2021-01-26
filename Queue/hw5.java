package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class hw5 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		
		int[] a = new int[pq.size()];
		int cnt=0;
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			a[cnt]=it.next();
			cnt++;
		}
		
		for(int p:a)
		{
			System.out.println(p);
		}

	}

}
