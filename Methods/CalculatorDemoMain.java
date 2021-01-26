package Methods;

import java.util.Scanner;

public class CalculatorDemoMain {

	public static void main(String[] args) {
		
		CalculatorDemo s = new CalculatorDemo();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the num1");
		int num1 = kb.nextInt();
		System.out.println("enter the num2");
		int num2 = kb.nextInt();
		kb.close();
		
		int a = s.CalculateSum(num1, num2);
		System.out.println("sum is :"+a);
		int b= s.CalculateDifference(num1, num2);
		System.out.println("difference is :"+b);

	}

}
