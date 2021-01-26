package BasicsOfJava;

public class cw5 {
	
	void diy()
	{
		int a=365, year, week, day;
		
		year = a/365;
		a = a % 365;
		System.out.println("no. of years: "+year);
		
		week = a / 7;
        a = a % 7;
		System.out.println("no. of week: "+week);
		
		day = a;
		System.out.println("no. of days:" +day);
	}

}
