package Strings;

public class hw32 {

	public static void main(String[] args) {
		
		String str = "Welcome to Java World";
		
		System.out.println(str.charAt(5));
		
		String str1 = "Welcome";
		
		int a = str.compareToIgnoreCase(str1);
		
		System.out.println(a);
		
		String str2 =" let us learn";
		
		String str3 = str.concat(str2);
		
		System.out.println(str3);
		
		System.out.println(str3.indexOf('a'));
		
		System.out.println(str3.replace('a', 'e'));
		
		System.out.println(str3.substring(4, 10));

	}

}
