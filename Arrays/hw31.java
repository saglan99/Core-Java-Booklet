package Arrays;

public class hw31 {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					sum=sum+a[i][j];
				}
				
			}
			
		}
		System.out.println(sum);

	}

}
