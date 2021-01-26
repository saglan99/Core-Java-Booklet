package ControlStatements;

import java.util.Scanner;

public class cw2 {
	
	int choice;

	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the number between 1-7");
		choice = kb.nextInt();
		kb.close();
	}
	
	void display()
	{
		switch(choice)
		{
		case 1 : System.out.println("you enter 1");
		         System.out.println("the 1st day of the week is monday");
		         break;
		         
		case 2 : System.out.println("you enter 2");
        		 System.out.println("the 2nd day of the week is tuesday");
        		 break;
        		 
		case 3 : System.out.println("you enter 3");
        		 System.out.println("the 3rd day of the week is wednesday");
        		 break;
        		 
		case 4 : System.out.println("you enter 4");
		 System.out.println("the 4th day of the week is thursday");
		 break;
		 
		case 5 : System.out.println("you enter 5");
		 System.out.println("the 5th day of the week is friday");
		 break;
		 
		case 6 : System.out.println("you enter 6");
		 System.out.println("the 6th day of the week is saturday");
		 break;
		 
		case 7 : System.out.println("you enter 7");
		 System.out.println("the 7th day of the week is sunday");
		 break;
		 
		 default : System.out.println("enter valid input");
		}
	}

}
