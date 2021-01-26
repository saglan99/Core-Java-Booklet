package CollectionList;

import java.util.ArrayList;
import java.util.Collections;

public class hw2 {

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
		
		boolean a = al.equals(al1);
		
		if(a)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}

	}

}
