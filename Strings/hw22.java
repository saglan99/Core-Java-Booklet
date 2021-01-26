package Strings;

public class hw22 {

	public static void main(String[] args) {
		
		String s = "aaabbbbbcccccccddddddddd";
		
		int[] arr = new int[256];
		
		for (int i = 0; i < s.length(); i++) 
		{
			arr[s.charAt(i)]++;
		}
		
		int max=0;
		int secmax=0;
		int secindex = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>1)
			{
				System.out.println(((char)i)+" has repeated character "+arr[i]);
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>secmax && arr[i]!=max)
			{
				secmax=arr[i];
				secindex=i;
			}
		}
		System.out.println((char)secindex+" is the most second frequent character "+secmax);
		
	}

}
