package Strings;

public class hw28 {

	public static void main(String[] args) {
		
		String str = "  sagar   landge    nagpur  ";
		
		int cnt=0;
		
		String str2 = str.trim();
		
		char[] ch = str2.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i+1]==' ')
			{
				cnt++;
			}
		}
		
		char[] ch2 = new char[ch.length-cnt];
		int count=0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i+1]==' ')
			{
				continue;
			}
			else
			{
				ch2[count]=ch[i];
				count++;
			}
		}
		for(char p:ch2)
		{
			System.out.print(p);
		}
		
	}

}
