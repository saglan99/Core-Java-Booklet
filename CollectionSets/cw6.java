package CollectionSets;

import java.util.HashSet;

public class cw6 {

	public static void main(String[] args) {
		
HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		
		HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
		
		System.out.println(hs1);

	}

}
