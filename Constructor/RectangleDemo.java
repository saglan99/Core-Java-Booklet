package Constructor;

public class RectangleDemo {
	
	int length;
	int breath;
	
	RectangleDemo() {
		
		System.out.println("null");
		
	}
	
	RectangleDemo(int a, int b) {
		
		this.length=a;
		this.breath=b;
		int z = area();
		System.out.println(z);
		
	}

	RectangleDemo(int a) {
		
		this.length=a;
		int z = area();
		System.out.println(z);
	
	}
	
	int area()
	{
		int area = length*breath;
		return area;
	}

}
