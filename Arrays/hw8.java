package Arrays;

public class hw8 {

	public static void main(String[] args) {
		
		int[] a= {43,65,4,32,12,56,46};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);

	}

}
