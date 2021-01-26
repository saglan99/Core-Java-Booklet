package Methods;

import java.util.Scanner;

public class Student {
	
	Student2 s = new Student2();
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter your roll no :");
		int rollNo=kb.nextInt();
		System.out.println("enter your name :");
		String name=kb.next();
		System.out.println("enter your contact no. :");
		int phn=kb.nextInt();
		System.out.println("enter your Total Marks :");
		int marks=kb.nextInt();
		kb.close();
		
		s.DisplayData(rollNo,name,phn,marks);
	}

}
