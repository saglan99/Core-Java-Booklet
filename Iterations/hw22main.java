package Iterations;

public class hw22main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hw22 s = new hw22();
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				int a = s.give(i, j);
				System.out.print(a+" ");
			}
			
			System.out.println();
		}

	}

}
