package Methods;

import java.util.Scanner;

public class AccountManagement {
	
	
	void insertData()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter your name");
		String name=kb.next();
		System.out.println("enter your phone number");
		int pn=kb.nextInt();
		System.out.println("enter your account number");
		int ac=kb.nextInt();
		kb.close();
		
		display(name,pn,ac);
	}
	
	void display(String a,int b, int c)
	{
		System.out.println("costumer name :"+a);
		System.out.println("costumer phone number :"+b);
		System.out.println("costumer account number :"+c);
	}
	
	void depositeAmount()
	{
		System.out.println("enter amount to be deposit");
		
	}
	
	void withdrawAmount()
	{
		
	}
	
	void accountBalance()
	{
		
	}

}
