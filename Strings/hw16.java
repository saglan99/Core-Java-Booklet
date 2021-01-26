package Strings;

public class hw16 {

	public static void main(String[] args) {
		
		String s = "012345ggbhgh6789";
		
		int sum=0;
		
		char[] ch = s.toCharArray();
		
		for(char p: ch)
		{
			if(p>=48 && p<=57)
			{
				int a = (char)p;
				sum=sum+(a-48);
			}
			
		}
		System.out.println(sum);

	}

}
