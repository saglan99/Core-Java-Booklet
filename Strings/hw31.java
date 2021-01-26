package Strings;

public class hw31 {

	public static void main(String[] args) {
		
		String s = "abcXYZ";
		
		String str = s.toUpperCase();
		
		char[] ch = str.toCharArray();
		
		char[] ch1 = new char[ch.length];
		
		for (int i = 0; i < ch.length; i++)
		{
			char a = (char) (155-(char)ch[i]);
			ch1[i]=a;
		}
		
		for(char p: ch1)
		{
			System.out.print(p);
		}

	}

}
