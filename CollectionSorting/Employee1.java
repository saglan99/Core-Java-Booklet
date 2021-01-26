package CollectionSorting;

public class Employee1 {
	
	int EmpId;
	String EmpName;
	int EmpSal;
	
	public Employee1(int empId, String empName, int empSal) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
	}
	
	@Override
	public String toString() {
		return EmpId+" "+EmpName+" "+EmpSal;
	}
	
	

}
