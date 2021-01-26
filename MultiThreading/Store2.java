package MultiThreading;

public class Store2 {
	
	int biscuit=0;
	
	private Store2() {}
	
	static Store2 s = new Store2();
	
	public static Store2 getStore2() {
		return s;
	}
	
	public synchronized void produce()
	{
		biscuit++;
		System.out.println("produced in stock "+biscuit);
		if(biscuit>10)
		{
			notify();
		}
	}
	
	public synchronized void consume()
	{
		if(biscuit<10)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		biscuit--;
		System.out.println("consume from stock"+biscuit);
	}

}
