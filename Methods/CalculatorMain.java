package Methods;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator s = new Calculator();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = kb.nextInt();
		System.out.println("enter num1");
		int num2 = kb.nextInt();
		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		System.out.println("enter your choice");
		int choice = kb.nextInt();
		
		switch(choice)
		{
		case 1 : float z = s.addition(num1, num2);
				System.out.println("addition is :"+z);
				break;
				
		case 2 : float x = s.addition(num1, num2);
				System.out.println("subtraction is :"+x);
				break;
		
		case 3 : float y = s.addition(num1, num2);
				System.out.println("multiplication is :"+y);
				break;
		
		case 4 : float p = s.addition(num1, num2);
				System.out.println("division is :"+p);
				break;
		
		default : System.out.println("please enter valid operation");
		}

	}

}
