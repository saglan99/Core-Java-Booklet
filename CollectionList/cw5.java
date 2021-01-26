package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(12);
		a.add(14);
		a.add(16);
		a.add(17);
		a.add(18);
		
		a.set(2, 140);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
