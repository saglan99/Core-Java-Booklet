package Strings;

public class hw35 {

	public static void main(String[] args) {
		
		String str = " dhcfgdwhg   dckjhwdbcfj     jhdbcj   ";
		
		int count=0;
		
		String str1 = str.trim();
		
		char[] ca = str1.toCharArray();
	
		for (int i = 0; i < ca.length; i++)
		{
			if(str1.charAt(i)==' ' && str1.charAt(i+1)==' ')
			{
				count++;
			}
		}
		
		char[] ca2 = new char[ca.length-count];
		
		int cnt=0;
		
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==' ' && ca[i+1]==' ')
			{
				continue;
			}
			else
			{
				ca2[cnt]=ca[i];
				cnt++;
			}
		}
		
		for(char p:ca2)
		{
			System.out.print(p);
		}
		
		

	}

}
