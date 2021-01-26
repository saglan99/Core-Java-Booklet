package Arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class credntechpro {

	public static void main(String[] args) {
		
		ArrayList<Chocolate> list=new ArrayList<Chocolate>();
		list.add(new Chocolate(1, "Ghirardelli", 35));
		list.add(new Chocolate(2, "Patchi", 25));
		list.add(new Chocolate(3, "Galaxy", 40));
		list.add(new Chocolate(4, "Cadbury", 30));
		list.add(new Chocolate(5, "Ferrero Rocher", 40));
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		ch--;
		
		System.out.println("give me money");
		int sum=0;
		sc.nextLine();
		String amount = sc.nextLine();
		String[] sa = amount.split(",");
		for (int i = 0; i < sa.length; i++) 
		{
			sum = sum+Integer.parseInt(sa[i]);
		}
		System.out.println("confirm your order yes or no");
		String str = sc.nextLine();
		
		if(str.compareToIgnoreCase("yes")==0)
		{
		if(list.get(ch).price<=sum)
		{
			System.out.println("giving you "+list.get(ch).name+" | "+(sum-(list.get(ch).price)));
		}
		}
	}

}
