package Methods;

public class Triangle {
	
	int side1;
	int side2;
	int side3;

	
	public Triangle(int side1, int side2, int side3)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		trianglePerimeter();
		triangleArea();
		isoceles();
		equilateral();
	}
	
	void trianglePerimeter()
	{
		int tp = side1 + side2 + side3;
		System.out.println("perimeter of triangle is :"+tp);
	}
	
	void triangleArea()
	{
		int ta = side1 * side2 * side3;
		System.out.println("area of triangle is :"+ta);
	}
	
	void isoceles()
	{
		if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("it is a isoceles triangle");
		}
		else
		{
			System.out.println("it is not a isoceles triangle");
		}
	}
	
	void equilateral()
	{
		if(side1==side2 && side2==side3 && side1==side3)
		{
			System.out.println("it is a equilateral triangle");
		}
		else
		{
			System.out.println("it is not a equilateral triangle");
		}
	}
	

	
	

}
