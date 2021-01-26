package ControlStatements;

import java.util.Scanner;

public class hw1 {
	
	int a,b,c;

	void input()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the num1");
		a = kb.nextInt();
		
		System.out.println("enter the num1");
		b = kb.nextInt();
		
		System.out.println("enter the num1");
		c = kb.nextInt();
		
		kb.close();
	}
	
	void findMax()
	{
		if(a>b && a>c)
		{
			System.out.println("greater among three number is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("greater among three number is: "+b);
		}
		else
		{
			System.out.println("greater among three number is: "+c);
		}
	}

}
