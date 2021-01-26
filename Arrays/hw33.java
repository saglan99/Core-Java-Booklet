package Arrays;

import java.util.Scanner;

public class hw33 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int[] a = new int[10];
		System.out.println("enter the element to add into a array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=kb.nextInt();
		}
		
		kb.close();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				System.out.println(a[i]+" is a positive number");
			}
			else
			{
				System.out.println(a[i]+" is a negative number");
			}
		
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is a even number");
			}
			else
			{
				System.out.println(a[i]+" is a odd number");
			}
			
			System.out.println();
			
		}
		

	}

}
