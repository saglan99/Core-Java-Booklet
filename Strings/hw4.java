package Strings;

public class hw4 {

	public static void main(String[] args) {
		
		String s = "sagar";
		String s1 = "SAgar";
		
		int a = s.compareToIgnoreCase(s1);
		
		if(a==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
