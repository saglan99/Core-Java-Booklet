package CollectionSets;

import java.util.TreeSet;

public class hw9 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("red");
		ts.add("yellow");
		ts.add("pink");
		ts.add("brown");
		ts.add("orange");
		
		TreeSet<String> ts1 = (TreeSet<String>) ts.clone();
		System.out.println(ts1);

	}

}
