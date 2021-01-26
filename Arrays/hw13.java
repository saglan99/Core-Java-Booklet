package Arrays;

public class hw13 {

	public static void main(String[] args) {
		
		int[][] a = {
				{4,3,2,1},
				{8,6,5,4},
				{4,3,2,3},
				{8,5,4,3},
		};
		
		for (int i = 0; i < (a.length*2)-1; i++)
		{
			
			for (int j = 0; j < a.length; j++) 
			{
				
				for (int j2 = 0; j2 < a.length; j2++)
				{
					
					if(j+j2==i)
					{
						System.out.print(a[j][j2]);
					}
					
				}
				
				
				
			}
			System.out.println();
			
		}

	}

}
