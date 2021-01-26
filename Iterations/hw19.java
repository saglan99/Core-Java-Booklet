package Iterations;

public class hw19 {
	
	void loop()
	{
		for(int i=1;i<=5;i++)
		{
			int a=0;
			for(int j=1;j<=i;j++)
			{
				if(a==1)
				{
					a=0;
				}
				else
				{
					a=1;
				}
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
