package Strings;

public class cw4 {

	public static void main(String[] args) {
		
		String s1 = "sagar";
		String s2 = "sAgar";
		int a = s1.compareToIgnoreCase(s2);
		
		if(a==0)
		{
			System.out.println("string are equal");
		}
		else
		{
			System.out.println("string are not equal");
		}

	}

}
