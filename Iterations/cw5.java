package Iterations;

public class cw5 {
	
	void pattern()
	{
		for(int i=0;i<7;i++)
		{
			char ch='A';
			for(int j=0;j<13;j++)
			{
				if(i+j<7 || j-i>=6)
				{
					if(j<7)
					{
						System.out.print(ch);
						ch++;
						if(j==6)
						{
							ch--;
						}
					}
					else
					{
						ch--;
						System.out.print(ch);
						
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

