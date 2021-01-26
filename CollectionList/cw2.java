package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(12);
		a.add(10);
		a.add(2);
		a.add(5);
		a.add(23);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
