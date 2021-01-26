package BasicsOfJava;

public class cw4 {
	
	void swap()
	{
		int a=9;
		int b=5;
		int temp;
		
		System.out.println("before swap :"+"a="+a);
		System.out.println("before swap :"+"b="+b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("after swap :"+"a="+a);
		System.out.println("after swap :"+"b="+b);
	}

}
