package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class hw7 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);
		
		Iterator<Integer> it = ll.listIterator(2);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
