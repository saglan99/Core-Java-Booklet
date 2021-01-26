package MultiThreading;

public class cw9main {

	public static void main(String[] args) {
		
		Store s = new Store();
		T1 t1 = new T1(s);
		T2 t2 = new T2(s);
		t1.start();
		t2.start();

	}

}
