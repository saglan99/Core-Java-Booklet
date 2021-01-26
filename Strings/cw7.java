package Strings;

public class cw7 {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("sagar");
		String s = "sagar";
		String s2 = s1.toString();
		
		int a = s.compareTo(s2);
		
		if(a==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diferent");
		}
		

	}

}
