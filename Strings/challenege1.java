package Strings;

public class challenege1 {

	public static void main(String[] args) {
		
		char[] s1 = {'a','b','c','d','e','f','g'};
		char[] s2 = {'w','x','y','z'};
		int size=0;
		int s1size = s1.length;
		int s2size = s2.length;
		int arrsize;
		boolean flag = true;
		int cnt=0;
		int diff;
		
		if(s1size>s2size)
		{
			diff=s1size-s2size;
			arrsize = (s2size*2)+diff;
			flag=true;
		}
		else
		{
			diff=s1size-s2size;
			arrsize = (s1size*2)+diff;
			flag=false;
		}
		
		char[] s3 = new char[arrsize];
		
		if(flag)
		{
			for (int i = 0; i < s2.length; i++) {
				
				s3[cnt]=s1[i];
				cnt++;
				s3[cnt]=s2[i];
				cnt++;
				
			}
		}
		else
		{
			for (int i = 0; i < s1.length; i++) {
				
				s3[cnt]=s1[i];
				cnt++;
				s3[cnt]=s2[i];
				cnt++;
				
			}
		}
			
		
		if(flag)
		{
			for (int i = diff+1; i < s1.length; i++) {
				
				s3[cnt]=s1[i];
				cnt++;
				
			}
		}
		else
		{
			for (int i = diff+1; i < s2.length; i++) {
				
				s3[cnt]=s2[i];
				cnt++;
				
			}
		}
		
		
		
		
		
		for(char p:s3)
		{
			System.out.print(p+" ");
		}

	}

}

