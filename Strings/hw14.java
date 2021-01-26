package Strings;

public class hw14 {

	public static void main(String[] args) {
		
		String s = "7030298cvs891";
		
		char ch[] = s.toCharArray();
		
		boolean flag = true;
		
		for(char p: ch)
		{
			if(p>=48 && p<=57)
			{
				flag = true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("all are digits");
		}
		else
		{
			System.out.println("all are not digits");
		}

	}

}
