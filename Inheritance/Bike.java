package Inheritance;

public class Bike extends Vehicle{
	
	int discountRate=10;
	
	Bike()
	{
		display();
	}
	
	void display()
	{
		vehicleName="royal";
		vehicleModelNumber=350;
		vehiclePrice=200000;
		serviceStationName="paragon";
		dp = discount(vehiclePrice);
		Display1();
	}
	
	double discount(int vehiclePrice)
	{
		dp = vehiclePrice-(0.10*vehiclePrice);
		return dp;
	}

}
