package CollectionMap;

import java.util.HashMap;

public class hw2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 300);
		
		boolean a = hm.containsKey(5);
		
		if(a)
		{
			System.out.println("value is there");
		}
		else
		{
			System.out.println("value is not there");
		}

	}

}
