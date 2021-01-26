package Containment;

public class Staff {
	
	String employeeName;
	String employeeAddress;
	
	Staff(String a , String b)
	{
		employeeName=a;
		employeeAddress=b;
	}
	
	
	void displayStaffDetails()
	{
		System.out.println("college name : "+employeeName);
		System.out.println("college address : "+employeeAddress);
	}

}
