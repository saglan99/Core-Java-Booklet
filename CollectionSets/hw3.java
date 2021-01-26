package CollectionSets;

import java.util.HashSet;

public class hw3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(121);
		hs.add(131);
		hs.add(14);
		hs.add(15);
		
		hs.removeAll(hs);
		System.out.println(hs);

	}

}
