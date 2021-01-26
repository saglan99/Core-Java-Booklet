package Inheritance;

public class Square {
	
	int side;
	
	void area()
	{
		int area = side*side;
		System.out.println("area of square is :"+area);
	}
	
	Square(int s)
	{
		this.side=s;
	}

}
