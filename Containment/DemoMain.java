package Containment;

public class DemoMain {

	public static void main(String[] args) {
		
		Person s = new Person("sagar", 12345, "IT", 23, "IT PARK");
		s.displayPersonDetails();
		
		Address sz = new Address(303, "nagpur", "maharashtra", "india");
		
		College s1 = new College("priyadarshini",sz);
		s1.displayCollegeDetails();
		
		Staff s2 = new Staff("Shailendra","Nagpur");
		s2.displayStaffDetails();

	}

}
