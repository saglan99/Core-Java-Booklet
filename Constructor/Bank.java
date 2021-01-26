package Constructor;

public class Bank {
	
	int amount=5000;
	
	Bank()
	{
		System.out.println("total amount is :"+amount);
	}
	
	Bank(int amt)
	{
		amount = amount+amt;
		System.out.println("total amount is :"+amount);
	}

}
