package Methods;

public class CalculatorDemo {
	
	int CalculateSum(int num1,int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	int CalculateDifference(int num1, int num2)
	{
		int diff;
		if(num1>num2)
		{
			diff = num1-num2;
			return diff;
		}
		else
		{
			diff = num2-num1;
			return diff;
		}
	
	}

}
