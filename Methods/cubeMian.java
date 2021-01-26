package Methods;

import java.util.Scanner;

public class cubeMian {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the height of cube");
		int h = kb.nextInt();
		System.out.println("enter the width of cube");
		int w = kb.nextInt();
		System.out.println("enter the depth of cube");
		int d = kb.nextInt();
		kb.close();
		
		Cube s = new Cube();
		s.volume(h,w,d);
		

	}

}
