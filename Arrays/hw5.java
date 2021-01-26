package Arrays;

public class hw5 {

	public static void main(String[] args) {
		
		int[] a1 = {4,5,6,3,2,2,4,5,6};
		
		for(int i=1;i<a1.length/2;i++)
		{
			int temp=a1[i-1];
			a1[i-1]=a1[a1.length-i];
			a1[a1.length-i]=temp;
		}
		
		for(int p:a1)
		{
			System.out.print(p+" ");
		}
		
		
		
		
		

	}

}
