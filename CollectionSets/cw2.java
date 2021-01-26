package CollectionSets;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;

public class cw2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
