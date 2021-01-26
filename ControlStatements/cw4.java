package ControlStatements;

import java.util.Scanner;

public class cw4 {
	
	int unit;
	double bill;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter total unit");
		unit = kb.nextInt();
		kb.close();
	}
	
	void totalBill()
	{
		if(unit<=50)
		{
			bill = unit*0.5;
		}
		else if(unit<=150)
		{
			bill = (50*0.5)+(unit-50)*0.75;
		}
		else if(unit<=250)
		{
			bill = (50*0.5)+(100*0.75)+(unit-150)*1.2;
		}
		else
		{
			bill = (50*0.5)+(100*0.75)+(100*1.25)+(unit-250)*1.5;
		}
		
		bill = (bill*0.2)+bill;
		
		System.out.println("total bill is:"+bill);
	}
	
	

}
