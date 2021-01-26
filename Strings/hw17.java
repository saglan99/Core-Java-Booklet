package Strings;

public class hw17 {

	public static void main(String[] args) {
		
		String str = "aaabbbbbccccccddddddeeeee";
		
		int[] arr = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>1)
			{
				System.out.println(((char)i)+" : "+(arr[i]-1));
			}
			
		}
		
		

	}

}
