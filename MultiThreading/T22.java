package MultiThreading;

public class T22 extends Thread{
	
Store2 s = Store2.getStore2();
	
	@Override
	public void run() {
		while(true)
		{
			s.consume();
		}
	}

}
