package Strings;

public class hw19 {

	public static void main(String[] args) {
		
		String str = "aaabbbbbccccccddddddddddddddeeeee";
		
		int[] arr = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		System.out.println(max);
		
		

	}

}
