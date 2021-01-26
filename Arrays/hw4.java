package Arrays;

public class hw4 {

	public static void main(String[] args) {
		
		int[] a1 = {4,6,3,2,43,5,67,7,4};
		int[] a2 = new int[a1.length];
		
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		
		for(int p : a2)
		{
			System.out.print(p+" ");
		}

	}

}
