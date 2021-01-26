package BasicsOfJava;

public class hw7 {
	
	int eng=56, mat=67, sci=34, his=98, geo=67, total, percentage;
	
	void sum()
	{
		total = eng+mat+sci+his+geo;
		System.out.println("total marks is :"+total);
	}
	
	void avg()
	{
		percentage = (total * 100) / 500;
		System.out.println("Percentage : " +percentage);
	}

}
