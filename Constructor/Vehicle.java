package Constructor;

public class Vehicle {
	
	String color="white";
	int wheelCount=4;
	int gearsCount=6;
	
	Vehicle(String c, int g)
	{
		this();
	}

	Vehicle() {
		
		System.out.println("vehicle color :"+color);
		System.out.println("vehicle wheels :"+wheelCount);
		System.out.println("gears count :"+gearsCount);
		
	}
	

}
