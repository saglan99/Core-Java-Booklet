package CollectionList;

import java.util.ArrayList;

public class hw4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		ArrayList<Integer> al1 = (ArrayList<Integer>) al.clone();
		
		System.out.println(al1);
	}

}
