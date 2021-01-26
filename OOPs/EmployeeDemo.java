package OOPs;

public class EmployeeDemo {
	
	protected int empid = 123;
	public String empname ="sagar";
	private int empsal = 10000;
	String department="IT"; 
	
	public void doPublic()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(department);
	}
	
	void doDefault()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(department);
	}
	
	protected void doProtected()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(department);
	}
	
	private void doPrivate()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(department);
	}
	

}
