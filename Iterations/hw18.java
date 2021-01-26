package Iterations;

public class hw18 {
	
	void pattern()
	{
		for(int i=1;i<=17;i=i+2)
		{
			for(int j=1;j<=9;j++)
			{
				if(j-i<=0 && i+j<=18)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
