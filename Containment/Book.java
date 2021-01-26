package Containment;

public class Book {
	
	String name;
	int price;
	Author author;
	
	Book(String a, int b , Author c)
	{
		name=a;
		price=b;
		author=c;
	}
	
	void showDetails()
	{
		System.out.println("book name : "+name);
		System.out.println("book price : "+price);
		System.out.println("author name : "+author.authorName);
		System.out.println("author age : "+author.age);
		System.out.println("author place : "+author.place);
	}

}
