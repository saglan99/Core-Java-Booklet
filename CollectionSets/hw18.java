package CollectionSets;

import java.util.TreeSet;

public class hw18 {

	public static void main(String[] args) {
		
TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(12);
		ts.add(6);
		ts.add(5);
		ts.add(4);
		ts.add(123);
		ts.add(124);
		
		ts.remove(6);
		System.out.println(ts);

	}

}
