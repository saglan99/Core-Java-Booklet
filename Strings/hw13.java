package Strings;

public class hw13 {

	public static void main(String[] args) {
		
		String s = "shailendra";
		char s1 = 'l';
		
		char[] ch = s.toCharArray();
		
		for(char p : ch)
		{
			if(p!=s1)
			{
				System.out.print(p);
			}
		}

	}

}
