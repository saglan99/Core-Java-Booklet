package Containment;

public class MainDemo {

	public static void main(String[] args) {
		
		Author s1 = new Author("sagar", 22, "nagpur");
		Book s2 = new Book("hallowon", 500, s1);
		s2.showDetails();

	}

}
