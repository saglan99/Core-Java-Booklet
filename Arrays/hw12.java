package Arrays;

public class hw12 {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,68,67,4,53,3};
		int ecnt=0;
		int ocnt=0;
		
		for(int p:a)
		{
			if(p%2==0)
				ecnt++;
			else
				ocnt++;
		}
		
		int[] even = new int[ecnt];
		int[] odd = new int[ocnt];
		
		int e=0;
		int o=0;
		
		for(int p:a)
		{
			if(p%2==0)
			{
				even[e]=p;
				e++;
			}
			else
			{
				odd[o]=p;
				o++;
			}
			
		}
		
		for(int p:even)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		for(int p:odd)
		{
			System.out.print(p+" ");
		}
	}

}
