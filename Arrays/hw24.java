package Arrays;

public class hw24 {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,0};
		
		int first=a[0];
		
		for (int i = 0; i < a.length-2; i++) {
			
			a[i]=a[i+1];
			a[i+1]=a[i+2];
			
		}
		a[a.length-1]=first;
		for(int p: a)
		{
			System.out.print(p+" ");
		}

	}

}
