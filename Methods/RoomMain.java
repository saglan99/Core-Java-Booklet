package Methods;

import java.util.Scanner;

public class RoomMain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter length of the room");
		int l=kb.nextInt();
		System.out.println("enter width of the room");
		int w=kb.nextInt();
		System.out.println("enter height of the room");
		int h=kb.nextInt();
		kb.close();
		
		Room s = new Room(l, w, h);
		
		int wwa = s.whiteWashingArea();
		System.out.println("Total white washing area is :"+wwa);

		int wwc = s.whiteWashingCost();
		System.out.println("Total white washing cost is :"+wwc);
		
		int fc = s.flooringCost();
		System.out.println("Total floor cost is :"+fc);
	}

}
