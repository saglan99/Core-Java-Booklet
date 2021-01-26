package OOPs;

import java.util.Scanner;

public class Company1 {
	
	Company2 s = new Company2();
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the year of exp you have in this organisation");
		int year=kb.nextInt();
		System.out.println("enter your salary");
		int salary=kb.nextInt();
		kb.close();
		
		int z=s.calculate(year, salary);
		System.out.println("experience :"+year);
		System.out.println("salary :"+salary);
		System.out.println("salary with bonus :"+z);
	}

}
