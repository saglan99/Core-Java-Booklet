package Arrays;

public class hw6 {

	public static void main(String[] args) {
		
		int[] a1 = {4,5,6,3,2,2,4,5,6};
		
		for(int i=0;i<a1.length/2;i++)
		{
			a1[i]=a1[i]+a1[a1.length-i-1];
			a1[a1.length-i-1]=a1[i]-a1[a1.length-i-1];
			a1[i]=a1[i]-a1[a1.length-i-1];
		}
		
		for(int p:a1)
		{
			System.out.print(p+" ");
		}

	}

}
