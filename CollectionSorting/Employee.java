package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {

	public static void main(String[] args) {
		
		ArrayList<Employee1> s = new ArrayList<Employee1>();
		s.add(new Employee1(12,"sagar",700));
		s.add(new Employee1(13,"komal",900));
		s.add(new Employee1(14,"pankaj",400));
		s.add(new Employee1(15,"aniket",500));
		s.add(new Employee1(16,"mayur",300));
		
		System.out.println(s);
		
		Collections.sort(s, new Employee2comp());
		
		System.out.println(s);
		
		

	}

}
