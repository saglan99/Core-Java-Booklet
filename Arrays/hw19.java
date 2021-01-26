package Arrays;

public class hw19 {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		
		for(int[] p:a)
		{
			for(int z:p)
			{
				System.out.print(z);
			}
			System.out.println();
		}

	}

}
