package Inheritance;

public class Rectangle extends Square{
	
	int length;
	int breadth;
	
	Rectangle(int l, int b)
	{
		super(8);
		this.length=l;
		this.breadth=b;
	}
	
	void area()
	{
		int area = length*breadth;
		System.out.println("area of rectangle is :"+area);
	}

}
