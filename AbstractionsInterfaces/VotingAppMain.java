package AbstractionsInterfaces;

import java.util.Scanner;

public class VotingAppMain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		Adult s = new Adult(14);
		s.registerUser();
		s.requestVotingNumber();
	}

}
