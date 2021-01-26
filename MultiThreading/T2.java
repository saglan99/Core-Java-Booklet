package MultiThreading;

public class T2 extends Thread{
	
	Store s1;
	T2(Store s)
	{
		s1=s;
	}
	@Override
	public void run() {
		while(true)
		{
			s1.Consume();
			
		}
	}

}
