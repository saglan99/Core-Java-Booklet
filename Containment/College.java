package Containment;

public class College {
	
	String collegeName;
	Address collegeAddress;
	
	College(String a , Address b)
	{
		collegeName=a;
		collegeAddress=b;
	}
	
	
	void displayCollegeDetails()
	{
		System.out.println("college name : "+collegeName);
		System.out.println("college address : "+collegeAddress);
		System.out.println("address : "+collegeAddress.street+" "+collegeAddress.city+" "+collegeAddress.country);
	}
	

}
