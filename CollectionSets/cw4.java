package CollectionSets;

import java.util.HashSet;

public class cw4 {

	public static void main(String[] args) {
		
HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		
		hs.removeAll(hs);
		System.out.println(hs);

	}

}
