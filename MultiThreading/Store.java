package MultiThreading;

public class Store {
	
	int biscuit=0;
	
	public synchronized void Produce()
	{
		biscuit++;
		System.out.println("added and stock :"+biscuit);
		if(biscuit>10)
		{
			notify();
		}
	}
	
	public synchronized void Consume()
	{
		biscuit--;
		System.out.println("consumed :"+biscuit);
		if(biscuit<10)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			
			}
		}
	}

}
