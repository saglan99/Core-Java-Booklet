package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw13 {

	public static void main(String[] args) {
		
TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(12);
		ts.add(6);
		ts.add(5);
		ts.add(4);
		ts.add(123);
		ts.add(124);
		
		int a = 100;
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext())
		{
			int b = it.next();
			if(b<a)
			{
				System.out.println(b);
			}
		}

	}

}
