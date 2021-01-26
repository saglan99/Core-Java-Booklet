package Arrays;

public class hw27 {

	public static void main(String[] args) {
		
		char[] s1 = {'a','b','c','d'};
		char[] s2 = {'w','x','y','z'};
		char[] s3 = new char[s1.length+s2.length];
		int cnt=0;
		
		for (int i = 0; i < s1.length; i++) {
			
			s3[cnt]=s1[i];
			cnt++;
			s3[cnt]=s2[i];
			cnt++;
			
		}
		
		for(char p:s3)
		{
			System.out.print(p+" ");
		}

	}

}
