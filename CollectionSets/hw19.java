package CollectionSets;

import java.util.ArrayList;
import java.util.HashSet;

public class hw19 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		System.out.println(al);
		
	}

}
