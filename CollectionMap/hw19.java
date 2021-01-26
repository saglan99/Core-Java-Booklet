package CollectionMap;

import java.util.TreeMap;

public class hw19 {

	public static void main(String[] args) {
		

		TreeMap<Integer, Integer> s = new TreeMap<Integer, Integer>();
		
		s.put(3, 300);
		s.put(2, 200);
		s.put(4, 400);
		s.put(5, 500);
		s.put(1, 100);
		
		System.out.println(s.firstKey());
		System.out.println(s.lastKey());

	}

}
