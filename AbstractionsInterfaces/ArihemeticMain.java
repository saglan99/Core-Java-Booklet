package AbstractionsInterfaces;

import arithmetic.Addition;
import arithmetic.Division;
import arithmetic.Multiplication;
import arithmetic.Subtraction;

public class ArihemeticMain {

	public static void main(String[] args) {
		
		Addition s = new Addition();
		s.add();
		
		Subtraction s1 = new Subtraction();
		s1.sub();
		
		Multiplication s2 = new Multiplication();
		s2.mul();
		
		Division s3 = new Division();
		s3.div();

	}

}
