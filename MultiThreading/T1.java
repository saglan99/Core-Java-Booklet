package MultiThreading;

public class T1 extends Thread{
	
	Store s1;
	T1(Store s)
	{
		s1=s;
	}
	@Override
	public void run() {
		while(true)
		{
			s1.Produce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
