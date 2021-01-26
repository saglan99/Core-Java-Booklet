package CollectionSets;

import java.util.Set;
import java.util.TreeSet;

public class hw6 {

	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet<String>();
		
		ts.add("red");
		ts.add("yellow");
		ts.add("pink");
		ts.add("brown");
		ts.add("orange");
		
		Set<String> ts1 = new TreeSet<String>(ts);
		System.out.println(ts1);
	}

}
