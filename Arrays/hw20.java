package Arrays;

public class hw20 {

	public static void main(String[] args) {
		
		int[][] a= {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		int sum=0;
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(i!=0 && j!=0 && j!=a.length-1 && i!=a.length-1)
				{
					sum=sum+a[i][j];
					cnt++;
				}
				
			}
			
		}
		System.out.println(sum);
		System.out.println("average is "+sum/cnt);

	}

}
