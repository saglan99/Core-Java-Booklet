package ControlStatements;

import java.util.Scanner;

public class cw1 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter integer value");
		int a = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("enter the string");
		String b = kb.nextLine();
		
		System.out.println("enter the character");
		char c = kb.next().charAt(0);
		
		kb.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
