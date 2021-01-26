package CollectionSorting;

import java.util.Comparator;

public class cw2comp implements Comparator<cw2>{

	@Override
	public int compare(cw2 o1, cw2 o2) {
		
		if(o1.salary==o2.salary)
		{
			
			int a = o1.name.compareTo(o2.name);
			if(a==0)
			{
				return 0;
			}
			else if(a<1)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		else if(o1.salary<o2.salary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
