package Inheritance;

public class ManagerDemo extends EmployeeDemo{
	
	ManagerDemo(long Id, String name, String address, long phone, int salary) 
	{
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary= salary;
		double ts1 = CalculateSalary();
		ts=ts1;
		double ta1 = calculateTrasportAllowance(salary);
		ta=ta1;
		display();
	}
	
	void display()
	{
		System.out.println("Id : "+employeeId);
		System.out.println("name : "+employeeName);
		System.out.println("Address : "+employeeAddress);
		System.out.println("Phone : "+employeePhone);
		System.out.println("salary : "+basicSalary);
		System.out.println("Gross Salary : "+ts);
		System.out.println("transport allowance : "+ta);
		
	}

}
