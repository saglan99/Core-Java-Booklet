package CollectionSets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hw5 {

	public static void main(String[] args) {
		
Set<String> ts = new TreeSet<String>();
		
		ts.add("red");
		ts.add("yellow");
		ts.add("pink");
		ts.add("brown");
		ts.add("orange");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
