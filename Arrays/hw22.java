package Arrays;

public class hw22 {

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
		
		int[][] sub = new int[a1.length][a1.length];
		int[][] mul = new int[a1.length][a1.length];
		
		for (int i = 0; i < a2.length; i++) {
			
			for (int j = 0; j < a2.length; j++) {
				
				int num1 = a1[i][j];
				int num2 = a2[i][j];
				int z=num1-num2;
				sub[i][j]=z;
				
			}
			
		}
		for (int i = 0; i < a2.length; i++) {
			
			for (int j = 0; j < a2.length; j++) {
				
				int num1 = a1[i][j];
				int num2 = a2[i][j];
				int f=num1*num2;
				mul[i][j]=f;
				
			}
			
		}
		System.out.println("subtraction of array is :");
		for(int[] p:sub)
		{
			for(int z:p)
			{
				System.out.print(z);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("multiplication of array is :");
		for(int[] p:mul)
		{
			for(int z:p)
			{
				System.out.print(z);
			}
			System.out.println();
		}

	}

}
