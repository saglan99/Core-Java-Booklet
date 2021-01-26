package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class hw25 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(11);
		
		int a =120;
		
		boolean flag=false;
		
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext())
		{
			if(it.next()!=a)
			{
				continue;
			}
			else
			{
				flag = true;
			}
		}
		
		if(flag)
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}

	}

}
