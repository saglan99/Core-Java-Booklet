package Methods;

public class objMain {

	public static void main(String[] args) {
		
		objDemo s = new objDemo(3, "sagar");
		System.out.println(s.name+" "+s.rn);
		
		objDemo s1 = new objDemo(s);
		System.out.println(s1.name+" "+s1.rn);
	}

}
