package Strings;

public class hw20 {

	public static void main(String[] args) {
		
		String s = "aaabbbcccdddeeeeeeeeffffff";
		
		char[] ch = s.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ch.length-1; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j])
				{
					ch[j]='*';
				}
				
			}
			
		}
		for(char p:ch)
		{
			if(p=='*')
			{
				count++;
			}
		}
		System.out.println(count);
		
		char[] ch2 = new char[ch.length-count];
		
		int cnt=0;
		
		for(char p:ch)
		{
			if(p=='*')
			{
				continue;
			}
			else
			{
				ch2[cnt]=p;
				cnt++;
			}
		}
		
		for(char p:ch2)
		{
			System.out.print(p);
		}

	}


}
