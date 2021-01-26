package Containment;

public class Person {
	
	String PName;
	long PAdhaarNo;
	String PJobName;
	long PJobId;
	String PJobLocation;
	
	public Person(String pName, long pAdhaarNo, String pJobName, long pJobId, String pJobLocation)
	{
		PName = pName;
		PAdhaarNo = pAdhaarNo;
		PJobName = pJobName;
		PJobId = pJobId;
		PJobLocation = pJobLocation;
	}
	
	Address s = new Address(303, "nagpur", "maharashtra", "india");
	
	void displayPersonDetails()
	{
		System.out.println("person name : "+PName);
		System.out.println("person adhaar number : "+PAdhaarNo);
		System.out.println("person job name : "+PJobName);
		System.out.println("person job id : "+PJobId);
		System.out.println("person job location"+ PJobLocation);
		System.out.println("address : "+s.street+" "+s.city+" "+s.country);
	}
	
	
	

}
