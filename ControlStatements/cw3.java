package ControlStatements;

import java.util.Scanner;

public class cw3 {
	
	int basicSalary;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter basic salary");
		basicSalary = kb.nextInt();
		kb.close();
	}
	
	void GrossSalary()
	{
		if(basicSalary<=10000)
		{
			System.out.println(basicSalary + (0.2*basicSalary) + (0.8*basicSalary));
		}
		else if(basicSalary<=20000)
		{
			System.out.println(basicSalary + (0.25*basicSalary) + (0.9*basicSalary));
		}
		else
		{
			System.out.println(basicSalary + (0.3*basicSalary) + (0.95*basicSalary));
		}
	}

}
