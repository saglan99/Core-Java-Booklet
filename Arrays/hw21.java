package Arrays;

public class hw21 {

	public static void main(String[] args) {
		
		int[][] a1 = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		
		int[][] a2 = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		
		int[][] a3 = new int[a1.length][a1.length];
		
		for (int i = 0; i < a2.length; i++) {
			
			for (int j = 0; j < a2.length; j++) {
				
				int num1 = a1[i][j];
				int num2 = a2[i][j];
				int sum=num1+num2;
				a3[i][j]=sum;
				
			}
			
		}
		for(int[] p:a3)
		{
			for(int z:p)
			{
				System.out.print(z);
			}
			System.out.println();
		}

	}

}
