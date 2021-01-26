package Arrays;

public class hw17 {

	public static void main(String[] args) {
		
		int[] a= {0,0,0,0,0,0,0,0,0,0,5,45,5,5,234};
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0)
			{
				a[i]=1;
			}
			
		}
		
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}
	

}
