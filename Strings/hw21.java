package Strings;

public class hw21 {

	public static void main(String[] args) 
	{
	
		String str = "sagar shailendraaaaa mahendra landge";
		
		String[] sa = str.split(" ");
		
		int max = 0;
		
		int index=0;
		
		for (int i = 0; i < sa.length; i++)
		{
			if (unilen(sa[i])>max) 
			{
				max = unilen(sa[i]);
				index = i;
			}
		}
		
		System.out.println("Max => "+max+" string "+sa[index]);
		
	}
	
	static int unilen(String a)
	{
		
		int cnt=0;
		for (int i = 0; i < a.length(); i++) 
		{
			for (int j = i+1; j < a.length(); j++) 
			{
				if(a.charAt(i)==a.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
		return a.length()-cnt;
	}

}
