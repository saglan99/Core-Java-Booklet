package Iterations;

public class task1 {

	public static void main(String[] args) {
		
		task2 s = new task2();
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<6-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				int a = s.give(i, j);
				System.out.print(a+" ");
			}
			
			System.out.println();
		}

	}


}
