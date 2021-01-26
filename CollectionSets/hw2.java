package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;

public class hw2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(121);
		hs.add(131);
		hs.add(14);
		hs.add(15);
		
		HashSet<Integer> hs1 = new HashSet<>();
		
		hs1.add(11);
		hs1.add(12);
		hs1.add(13);
		hs1.add(14);
		hs1.add(15);
		hs1.retainAll(hs);
		System.out.println(hs1);
		
		

	}

}
