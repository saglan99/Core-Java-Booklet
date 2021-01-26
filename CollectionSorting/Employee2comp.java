package CollectionSorting;

import java.util.Comparator;

public class Employee2comp implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		int s1 = o1.EmpSal;
		int s2 = o2.EmpSal;
		
		if(s1==s2)
		{
			return 0;
		}
		else if(s1<s2)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		
	}

}
