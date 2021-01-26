package CollectionMap;

import java.util.Collection;
import java.util.HashMap;

public class hw7 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		
		Collection<Integer> s = hm.keySet();
		System.out.println(s);

	}

}
