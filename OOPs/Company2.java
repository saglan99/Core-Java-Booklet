package OOPs;

public class Company2 {
	
	int ts;
	
	int calculate(int year, int salary)
	{
		if(year<5)
		{
			ts=(int) (salary+(0.15*salary));
		}
		else
		{
			ts=(int) (salary+(0.35*salary));
		}
		return ts;
	}

}
