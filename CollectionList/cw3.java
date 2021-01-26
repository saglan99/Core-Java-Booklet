package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		a.set(0, 100);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
