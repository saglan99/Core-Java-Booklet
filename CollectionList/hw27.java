package CollectionList;

import java.util.LinkedList;

public class hw27 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(11);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(121);
		ll.add(134);
		ll.add(14);
		ll.add(15);
		ll.add(11);
		
		boolean a = ll.equals(ll1);

		if(a)
		{
			System.out.println("its same");
		}
		else
		{
			System.out.println("its not same");
		}

	}

}
