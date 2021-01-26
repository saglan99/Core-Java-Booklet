package Iterations;

public class cw4 {
	
	int a=1;
	
	void pattern()
	{
		for(int i=0;i<4;i++)
		{
			a=i;
			for(int j=0;j<5-i;j++)
			{
				a++;
				System.out.print(a);
			}
			System.out.println();
		}
		
		for(int i=1;i<6;i++)
		{
			a=5-i;
			for(int j=0;j<i;j++)
			{
				a++;
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
