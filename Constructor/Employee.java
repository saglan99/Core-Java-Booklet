package Constructor;

public class Employee {
	
	String name ;
	int salary;
	
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
		calculate();
		display();
	}
	
	Employee()
	{
		this("sagar", 10000);
	}
	
	void calculate()
	{
		System.out.println("salary :"+salary);
	}
	
	void display()
	{
		System.out.println("name :"+name);
	}

}
