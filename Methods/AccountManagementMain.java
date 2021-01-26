package Methods;

import java.util.Scanner;

public class AccountManagementMain {

	public static void main(String[] args) {
		
		int ab=0;
		
		AccountManagement s = new AccountManagement();
		s.insertData();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to deposit amount");
		System.out.println("press 2 to withdrawn amount");
		System.out.println("press 3 to account balance");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: s.depositeAmount();
		break;
		
		case 2: s.withdrawAmount();
		break;
		
		case 3: s.accountBalance();
		break;
		
		default: System.out.println("thank you for banking with us");
		}

	}

}
