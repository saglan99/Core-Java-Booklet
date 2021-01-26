package Arrays;

public class hw28 {
	
	static int a[][]= {
			{6,3,1},
			{9,7,8},
			{2,4,5},
	};

	public static void main(String[] args) {
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(isSmallestInRow(i,j) && isGreatestInRow(i,j))
				{
					System.out.println(a[i][j]);
				}
			}
		}


	}
	
	
	private static boolean isSmallestInRow(int i, int j) {
		boolean smallest = true;
		for (int j2 = 0; j2 < a.length; j2++) {
			if(a[i][j2]<a[i][j])
			{
				smallest = false;
				break;
			}
		}
		if(smallest)
			return true;
		else
			return false;
	}

		private static boolean isGreatestInRow(int i, int j) {
			boolean greatest = true;
			for (int j2 = 0; j2 < a.length; j2++) {
				if(a[j2][j]>a[i][j])
				{
					greatest = false;
					break;
				}
			}
			if(greatest)
				return true;
			else
				return false;
		}
	

}


