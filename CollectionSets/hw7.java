package CollectionSets;

import java.util.Collections;
import java.util.Iterator;

import java.util.TreeSet;

public class hw7 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("red");
		ts.add("yellow");
		ts.add("pink");
		ts.add("brown");
		ts.add("orange");
		
		System.out.println(ts);
		
		Iterator<String> it =ts.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	

	}

}
