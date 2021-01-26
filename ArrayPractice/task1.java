package ArrayPractice;

import java.util.Scanner;

public class task1 {
	
	static int[] a = {0,0,0,1,1,1};
	
	static int n = a.length-1;
	
	static int leap = 5;
	
	static int i=0;

	public static void main(String[] args) {
		
		game();

	}

	private static void game() 
	{	
		
		if(i>n)
		{
			System.out.println("yes");
		}
		else
		{
		if(a[i+leap]==0 || a[i+1]==0 || a[i-1]==0)
		{
			if(a[i+leap]==0)
			{
				i=i+leap;
				game();
			}
			else if(a[i+1]==0)
			{
				i=i+1;
				game();
			}
			else if(i!=0)
			{
				if(a[i-1]==0)
				{
					i=i-1;
					game();
				}
			}
		}
		else
		{
			System.out.println("no");
		}
	}
		
		
	}

	private static void result() {
		
		
		
	}

}
