package Inheritance;

public class EmployeeDemo {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	double ts;
	double ta;
	
	
	double CalculateSalary()
	{
		double salary=(basicSalary + (basicSalary *specialAllowance/100) + (basicSalary*hra/100));
		return salary;
	}
	
	double calculateTrasportAllowance(int bs)
	{
		double transa = bs*0.10;
		return transa;
	}

}
