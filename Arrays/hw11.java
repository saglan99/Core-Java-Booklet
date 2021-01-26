package Arrays;

public class hw11 {

	public static void main(String[] args) {
		
		int[] a= {4,5,3,32,2,3,3,3,3,56,7,78,};
		
		int cnt =0;
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					a[j]=0;
				}
				
			}
			
		}
		
		int[] a1= new int[a.length-cnt];
		int c=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0)
			{
				continue;
			}
			else
			{
				a1[c]=a[i];
				c++;
			}
			
		}
		
		for(int p:a1)
		{
			System.out.println(p);
		}
				
				
			
	
		

	}

}
