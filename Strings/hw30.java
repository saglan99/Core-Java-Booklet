package Strings;

public class hw30 {
	
	static void pallindrome(StringBuffer s)
	{
		StringBuffer s2=new StringBuffer(s);
		s2.reverse();
		int a = s.compareTo(s2);
		if(a==0)
		{
			System.out.println(s+" is a pallindrome.");
		}
	}

	public static void main(String[] args) {
		
		StringBuffer[] sb = new StringBuffer[6];
		
		sb[0]= new StringBuffer("maam");
		sb[1]= new StringBuffer("shailendra");
		sb[2]= new StringBuffer("jaaj");
		sb[3]= new StringBuffer("om");
		sb[4]= new StringBuffer("sonu");
		sb[5]= new StringBuffer("mishka");
		
		for (int i = 0; i < sb.length; i++) 
		{
			for (int j = i+1; j < sb.length; j++) 
			{
				if (sb[i].length()>sb[j].length()) 
				{
					StringBuffer temp = sb[i];
					sb[i]=sb[j];
					sb[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < sb.length; i++) 
		{
			System.out.println(sb[i]);
		}
		
		for (int i = 0; i < sb.length; i++) 
		{
			pallindrome(sb[i]);
		}
		
		

	}

}
