package Methods;

public class objDemo {
	
	int rn;
	String name;
	
	objDemo(int a, String b)
	{
		this.rn=a;
		this.name=b;
	}
	
	objDemo(objDemo d)
	{
		this.rn=d.rn;
		this.name=d.name;
	}

}
