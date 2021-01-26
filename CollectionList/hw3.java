package CollectionList;

import java.util.ArrayList;

public class hw3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		
		al1.add(12);
		al1.add(1);
		al1.add(12);
		al1.add(12);
		al1.add(12);
		
		al.addAll(al1);
		
		System.out.println(al);

	}

}
