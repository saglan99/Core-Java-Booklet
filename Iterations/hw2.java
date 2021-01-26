package Iterations;

import java.util.Scanner;

public class hw2 {
	
	int a;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number");
		a=kb.nextInt();
		kb.close();
		table();
	}

	void table() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
		
	}

}
