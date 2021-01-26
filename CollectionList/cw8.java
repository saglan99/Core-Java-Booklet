package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class cw8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(162);
		a.add(145);
		a.add(156);
		a.add(147);
		a.add(178);
		
		Collections.sort(a);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
