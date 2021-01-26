package CollectionMap;

import java.util.HashMap;

import java.util.Set;

public class hw6 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		
		Set<Integer> s = hm.keySet();
		System.out.println(s);

	}

}
