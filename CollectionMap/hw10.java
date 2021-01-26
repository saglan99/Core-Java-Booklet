package CollectionMap;

import java.util.HashMap;

public class hw10 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>(hm);

		System.out.println(hm1);
	}

}
