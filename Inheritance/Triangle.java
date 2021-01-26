package Inheritance;

public class Triangle extends Rectangle{
	
	int side1;
	int side2;
	int side3;
	
	Triangle(int s1, int s2, int s3)
	{
		super(5, 8);
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
		area();
	}
	
	void area()
	{
		int p = (side1+side2+side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("area of triangle is "+area);
	}

}
