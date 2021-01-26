package Containment;

public class Author {
	
	String authorName;
	int age;
	String place;
	
	Author(String a, int b, String c)
	{
		getter(a,b,c);
	}
	
	void getter(String a, int b, String c)
	{
		setter(a,b,c);
	}
	
	void setter(String a, int b, String c)
	{
		authorName=a;
		age=b;
		place=c;
	}
	
	

}
