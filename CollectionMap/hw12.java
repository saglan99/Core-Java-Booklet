package CollectionMap;

import java.util.TreeMap;

public class hw12 {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> s = new TreeMap<Integer, Integer>();
		s.put(1, 100);
		s.put(2, 200);
		s.put(3, 300);
		
		boolean a = s.containsValue(2002);
		
		System.out.println(a);
		

	}

}
