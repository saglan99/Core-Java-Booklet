package Arrays;

public class hw18 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,3,8,2,6,7,2}; //{1,8,7,4,5,6,3,2};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[j]%2!=0)
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
