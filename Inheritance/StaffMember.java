package Inheritance;

public class StaffMember {
	
	String MemberName;
	String MemberQualification;
	
	StaffMember(String a, String b)
	{
		MemberName=a;
		MemberQualification=b;
		showStaffMemberDetails();
	}
	
	void showStaffMemberDetails()
	{
		System.out.println("Department :"+MemberName);
		System.out.println("Hod Name :"+MemberQualification);
	}

}
