package Constructor;

import java.util.Scanner;

public class EmployeeDemoMain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the employee id :");
		int id = kb.nextInt();
		System.out.println("enter the employee name :");
		String name = kb.next();
		kb.close();
		
		EmployeeDemo s = new EmployeeDemo();
		s.getter(id, name);
		s.display();

	}

}
