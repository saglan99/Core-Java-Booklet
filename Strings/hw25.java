package Strings;

public class hw25 {

	public static void main(String[] args) {
		
		String str = "aaabbbbcccccddddddeeeeeee";
		
		int[] ch = new int[256];
		
		for (int i = 0; i < str.length(); i++) 
		{
			ch[str.charAt(i)]++;
		}
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>0)
			{
				System.out.println((char)i+" has the frequency of "+ch[i]);
			}
		}
		
		int min=100;
		int minchar = 0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>1 && ch[i]<min)
			{
				min=ch[i];
				minchar=i;
			}
		}
		
		System.out.println((char)minchar+" has minimum frequency of "+min);
		
		
		

	}

}
