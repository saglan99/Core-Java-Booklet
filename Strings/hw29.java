package Strings;

public class hw29 {

	public static void main(String[] args) {
		
		String str = "shailendra sagar mahendra landge";
		
		String[] sa = str.split(" ");
		
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		
		System.out.println("strings in ascending order : ");
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
		}
		
		System.out.println();
		
		System.out.println("strings in descending order : ");
		for (int i = sa.length-1; i >=0; i--)
		{
			System.out.println(sa[i]);
		}

	}

}
