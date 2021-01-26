package Arrays;

public class hw16 {

	public static void main(String[] args) {
		
		int[] a = {34,76,23,78,43,21,1,100};
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
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
		System.out.println();
		int diff = a[a.length-1]-a[0];
		System.out.println(diff);

	}

}
