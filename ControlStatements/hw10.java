package ControlStatements;

import java.util.Scanner;

public class hw10 {
	
	char ch;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the character");
		ch = kb.next().charAt(0);
		kb.close();
	}
	
	void pqr()
	{
		if((int)ch>=65 && (int)ch<=90 || (int)ch>=97 && (int)ch<=121)
		{
			System.out.println("it is a alphabet");
		}
		else if((int)ch>=48 && (int)ch<=57)
		{
			System.out.println("it is a number");
		}
		else
		{
			System.out.println("it is a special character");
		}
	}

}
