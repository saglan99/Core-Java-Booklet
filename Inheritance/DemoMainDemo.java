package Inheritance;

public class DemoMainDemo {
	
	public static void main(String[] args) {
		
		Employee s = new Employee();
		s.Sname="sagar";
		s.Sage=22;
		s.Saddress="nagpur";
		s.Sphonenumber=703029;
		s.Ssalary=10000;
		s.workSpecialiation="IT";
		System.out.println(s.Sname);
		System.out.println(s.Sage);
		System.out.println(s.Saddress);
		System.out.println(s.Sphonenumber);
		System.out.println(s.Ssalary);
		System.out.println(s.workSpecialiation);

		System.out.println();
		
		Manager s1 = new Manager();
		s1.Sname="samir";
		s1.Sage=25;
		s1.Saddress="pune";
		s1.Sphonenumber=4598437;
		s1.Ssalary=20000;
		s1.department="ITYG";
		System.out.println(s1.Sname);
		System.out.println(s1.Sage);
		System.out.println(s1.Saddress);
		System.out.println(s1.Sphonenumber);
		System.out.println(s1.Ssalary);
		System.out.println(s1.department);
	}
}
