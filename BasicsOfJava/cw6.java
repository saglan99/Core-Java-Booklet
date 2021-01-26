package BasicsOfJava;

public class cw6 {
	
	void ci()
	{
		double p = 10000;
		double r=0.10;
		double t=5;
		double n=12;
		
		double compint = ( p * (Math.pow(1+(r/n), n*t)))-p;
		
		System.out.println(compint);
		
	}

}
