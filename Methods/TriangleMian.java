package Methods;

import java.util.Scanner;

public class TriangleMian {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter side1");
		int side1 = kb.nextInt();
		System.out.println("enter side2");
		int side2 = kb.nextInt();
		System.out.println("enter side3");
		int side3 = kb.nextInt();
		kb.close();
		
		Triangle s = new Triangle(side1, side2, side3);

	}

}
