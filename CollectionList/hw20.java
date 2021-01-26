package CollectionList;

import java.util.LinkedList;

public class hw20 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(11);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
		ll1.add(21);
		ll1.add(22);
		ll1.add(23);
		ll1.add(24);
		ll1.add(25);
		ll1.add(11);
		
		ll.addAll(ll1);
		
		System.out.println(ll);

	}

}
