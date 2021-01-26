package Arrays;

public class hw3 {

	public static void main(String[] args) {
		
		int[] a = {4,6,3,2,4,6,7,4,4,4};
		int b =4;
		int count=0;
		
		for(int p:a)
		{
			if(p==b)
			{
				count++;
			}
		}
		
		int[] a2 = new int[a.length-count];
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				continue;
			}
			else
			{
				a2[cnt]=a[i];
				cnt++;
			}
		}
		
		for(int p:a2)
		{
			System.out.println(p);
		}

	}

}
