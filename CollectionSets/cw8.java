package CollectionSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class cw8 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		
		TreeSet<Integer> ts = new TreeSet<>(hs);
		System.out.println(ts);

	}

}
