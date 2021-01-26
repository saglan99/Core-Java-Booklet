package AbstractionsInterfaces;

public class Adult implements VotingApp{

	int age;
	
	Adult(int a)
	{
		age=a;
	}
	
	public void registerUser() {
		
		if(age>12)
		{
			System.out.println("You Have Successfully registered under Adults");
		}
		else
		{
			System.out.println("You Have Not succesfully registered under adult");
		}
		
	}

	public void requestVotingNumber() {
		
		if(age>12)
		{
			System.out.println("your voting id will be generated within a day");
		}
		else
		{
			System.out.println("oops, you are not");
		}
		
	}
	
	

}
