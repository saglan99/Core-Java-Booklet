package Constructor;

public class ShapeCircle {
	
	float pi=3.14f;
	float radius;
	
	ShapeCircle(float r) {
		
		radius=r;
		method(radius);
		
	}
	
	ShapeCircle(float r, float p) {
		
		radius=r;
		pi=p;
		method(radius);
		
	}
	
	void method(float radius) {
	
		System.out.println(pi*radius*radius);
		
	}


}
