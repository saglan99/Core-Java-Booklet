package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class cw7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(12);
		a.add(14);
		a.add(16);
		a.add(17);
		a.add(18);
		
		Collections.shuffle(a);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
