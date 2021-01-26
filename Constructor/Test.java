package Constructor;

public class Test {

	Test(int n)
	{
		evenOdd(n);
		factorial(n);
		sumDigit(n);
	}

	void sumDigit(int n) {
		
		int rev = n%10;
		int rem = n/10;
		System.out.println(rev+rem);
		
	}

	void factorial(int n) {
		
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
		
	}

	void evenOdd(int n) {
		
		if(n%2==0)
		{
			System.out.println("it is a even number");
		}
		else
		{
			System.out.println("it is a odd number");
		}
		
	}

}
