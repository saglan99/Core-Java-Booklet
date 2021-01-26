package OOPs;

import java.util.Scanner;

import ControlStatements.hw91;

public class hw21 {
	
hw22 s = new hw22();
	
	int a,b;
	int choice;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter num1");
		a=kb.nextInt();
		System.out.println("enter num2");
		b=kb.nextInt();
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for div");
		choice = kb.nextInt();
		kb.close();
		
		calculator();
	}
	
	void calculator()
	{
		switch(choice)
		{
			case 1: int s1 =s.add(a, b);
			System.out.println(s1);
			break;
			
			case 2: int s2 =s.sub(a, b);
			System.out.println(s2);
			break;
			
			case 3: int s3 = s.mul(a, b);
			System.out.println(s3);
			break;
			
			case 4: int s4 =s.div(a, b);
			System.out.println(s4);
			break;
			
			default : System.out.println("enter valid choice");
		}

}
}
