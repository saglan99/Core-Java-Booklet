package Inheritance;

public class Department {
	
	String departmentName;
	String HodName;
	
	Department(String a, String b) 
	{
		departmentName=a;
		HodName=b;
		DepartmentDetails();
	}
	
	void DepartmentDetails()
	{
		System.out.println("Department :"+departmentName);
		System.out.println("Hod Name :"+HodName);
	}

}
