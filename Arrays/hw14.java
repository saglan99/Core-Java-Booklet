package Arrays;

public class hw14 {

	public static void main(String[] args) {
		
		int[] a1 = {3,4,3,2,3,4,5};
		int[] a2 = {1,4,3,2,3,4,5};
		boolean flag=false;
		if(a1.length==a2.length)
		{
			for (int i = 0; i < a2.length; i++) 
			{
				if(a1[i]!=a2[i])
				{
					flag=true;
					continue;
				}
			}
			if(flag)
			{
				System.out.println("both arrays are not equal");
			}
			else
			{
				System.out.println("both arrays are equal");
			}
		}
		else
		{
			System.out.println("both arrays length are not equal");
		}

	}

}
