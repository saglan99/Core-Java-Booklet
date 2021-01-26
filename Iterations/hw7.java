package Iterations;

import java.util.Scanner;

public class hw7 {
	
	int start,end;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the start from number");
		start = kb.nextInt();
		System.out.println("enter the end number");
		end = kb.nextInt();
		kb.close();
	}
	
	void loop()
	{
		for(int i=start; i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is a even number");
			}
			else
			{
				System.out.println(i+" is a odd number");
			}
		}
	}

}
