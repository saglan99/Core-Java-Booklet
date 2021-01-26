package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw11 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(12);
		ts.add(6);
		ts.add(5);
		ts.add(4);
		ts.add(123);
		ts.add(124);
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext())
		{
			int a = it.next();
			if(a<7)
			{
				System.out.println(a);
			}
		}
		
		System.out.println(ts.lower(7));
		
	}

}
