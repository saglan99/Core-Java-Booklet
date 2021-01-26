package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("red");
		a.add("yellow");
		a.add("green");
		a.add("blue");
		a.add("orange");
		
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
