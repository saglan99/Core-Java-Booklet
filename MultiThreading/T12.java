package MultiThreading;

public class T12 extends Thread{
	
	Store2 s = Store2.getStore2();
	
	@Override
	public void run() {
		while(true)
		{
			s.produce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
