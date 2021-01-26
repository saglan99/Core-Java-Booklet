package AbstractionsInterfaces;

public class Kids implements VotingApp{

	int age;
	
	Kids(int a)
	{
		age=a;
	}

	public void registerUser() {
		
		if(age<12)
		{
			System.out.println("You Have Successfully registered under Kids");
		}
		else
		{
			System.out.println("You Have Not succesfully registered");
		}
		
	}

	
	public void requestVotingNumber() {
		
		if(age<12)
		{
			System.out.println("sorry cannot go for voting because age must be greater than 12 to vote");
		}
		
		
	}
	
	
	

}
