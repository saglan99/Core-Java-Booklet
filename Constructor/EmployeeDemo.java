package Constructor;

public class EmployeeDemo {
	
	int id;
	String name;
	
	void getter(int a , String b)
	{
		setter(a,b);
	}
	
	void setter(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println( id);
		System.out.println(name);
	}

}
