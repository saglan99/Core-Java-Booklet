package MultiThreading;

public class cw92main {

	public static void main(String[] args) {
		
		T12 t12 = new T12();
		T22 t22 = new T22();
		t12.start();
		t22.start();

	}

}
