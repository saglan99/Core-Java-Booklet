package Strings;

public class hw34 {

	public static void main(String[] args) {
		
		String s = "abcd gnvghvhgef g jdnjf ghg gtfgfdtd";
		String[] sa = s.split(" ");
		int max=0;
		int min=0;
		for (int i = 0; i < sa.length; i++)
		{
			
			if(sa[i].length()>sa[max].length())
			{
				max=i;
			}
			if(sa[i].length()<sa[min].length())
			{
				min=i;
			}
		}
		
		System.out.println("Largest Word: "+sa[max]);
		System.out.println("Smallest Word: "+sa[min]);

	}

}
