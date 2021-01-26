package Iterations;

public class task2 {
	
	public int give(int i, int j)
	{
		if(j==1)
		{
			return 1;
		}
		else if(i==j)
		{
			return 1;
		}
		else
		{
			return give(i-1,j)+give(i-1, j-1);
		}
	}

	}

