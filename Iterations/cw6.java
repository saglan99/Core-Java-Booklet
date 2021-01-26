package Iterations;

public class cw6 {
	
	int pink=0;
	int yellow=0;
	int pinkyellow=0;
	
	void pattern()
	{
		for(int i=33;i<999;i++)
		{
			if(i%3==0)
			{
				System.out.println("PINK");
				pink++;
			}
			else if(i%5==0)
			{
				System.out.println("YELLOW");
				yellow++;
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("PINK&YELLOW");
				pinkyellow++;
			}
			else
			{
				continue;
			}
		}
		System.out.println(pink);
		System.out.println(yellow);
		System.out.println(pinkyellow);
	}

}
