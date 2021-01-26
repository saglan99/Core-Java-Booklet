package CollectionSets;

import java.util.TreeSet;

public class hw8 {

	public static void main(String[] args) {
		
TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("red");
		ts.add("yellow");
		ts.add("pink");
		ts.add("brown");
		ts.add("orange");
		
		System.out.println(ts);
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());

	}

}
