package Arrays;

public class Student {
	
	int rollno;
	String name;
	int marks;
	
	Student(int a, String b, int c)
	{
		rollno=a;
		name=b;
		marks=c;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+marks);
	}
	
	

}
