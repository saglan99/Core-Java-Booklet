package CollectionList;

import java.util.LinkedList;

public class hw13 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(11);
		
		System.out.println(ll.indexOf(11));
		System.out.println(ll.lastIndexOf(11));
		

	}

}