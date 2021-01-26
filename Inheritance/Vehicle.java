package Inheritance;

public class Vehicle {
	
	String vehicleName;
	int vehicleModelNumber;
	int vehiclePrice;
	String serviceStationName;
	double dp;
	
	
	void Display1()
	{
		System.out.println("name :"+vehicleName);
		System.out.println("model no :"+vehicleModelNumber);
		System.out.println("price :"+vehiclePrice);
		System.out.println("service ststion name :"+serviceStationName);
		System.out.println("discounted price is :"+dp);
	}

}
