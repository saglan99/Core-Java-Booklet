package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class cw2main {

	public static void main(String[] args) {
		
		ArrayList<cw2> a = new ArrayList<cw2>();
		a.add(new cw2(1,"sagar",1000));
		a.add(new cw2(3,"sagar",4000));
		a.add(new cw2(2,"sagar",3000));
		a.add(new cw2(4,"sagar",2000));
		a.add(new cw2(5,"sagar",5000));
		
		System.out.println(a);
		
		Collections.sort(a, new cw2comp());
		
		System.out.println(a);
		

	}

}
