package Iterations;

public class hw16 {
	
	void pattern()
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a);
				if(a==1)
				{
					a=0;
				}
				else
				{
					a=1;
				}
			}
			System.out.println();
		}
	}

}
