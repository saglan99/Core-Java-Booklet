package Constructor;

public class Rectangle {
	
	int length;
	int width;
	
	Rectangle(int l,int w)
	{
		this.length=l;
		this.width=w;
		rectangleArea();
		rectanglePerimeter();
	}

	void rectanglePerimeter() {
		
		System.out.println("perimeter of rectangle :"+(length+width));
		
	}

	void rectangleArea() {

		System.out.println("area of rectangle :"+(length*width));
		
	}

}
