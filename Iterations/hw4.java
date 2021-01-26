package Iterations;

import java.util.Scanner;

public class hw4 {
	
	int num;
	int fact=1;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enetr the number");
		num = kb.nextInt();
		kb.close();
	}
	
	void factorial()
	{
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
