import java.util.*;

public class q7 {

	public static void main(String[] args) {
		List<Integer> sharedlist=new ArrayList<>();
		producer p=new producer(sharedlist);
		Thread Thread1=new Thread(p);
		
		consumer c=new consumer(sharedlist);
		Thread Thread2=new Thread(c);
		
		Thread1.start();
		Thread2.start();
		
	}

}
class producer implements Runnable{
	List<Integer> sharedlist=null;
	final int Maxsize=5;
	private int i=0;
	public producer(List<Integer> sharedlist)
	{
		super();
		this.sharedlist=sharedlist;
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				produce(i++);
			} 
			catch (InterruptedException e) {
				
			}
		}
	}
	public void produce(int i) throws InterruptedException
	{
		synchronized(sharedlist)
		{
			while(sharedlist.size()==Maxsize)
			{
				System.out.println("SharedList is full waiting for the consumer to consume");
				sharedlist.wait();
				
			}
		}
		synchronized(sharedlist)
		{
			System.out.println("Produced element is"+i);
			sharedlist.add(i);
			Thread.sleep(1000);
			sharedlist.notify();
		}
	}
}
class consumer implements Runnable{
	List<Integer> sharedlist=null;
	public consumer(List<Integer> sharedlist)
	{
		super();
		this.sharedlist=sharedlist;
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				consume();
			} 
			catch (InterruptedException e) {
				
			}
		}
	}
	public void consume() throws InterruptedException
	{
		synchronized(sharedlist)
		{
			while(sharedlist.isEmpty())
			{
				System.out.println("SharedList is empty waiting for the producer to produce");
				sharedlist.wait();
				
			}
		}
		synchronized(sharedlist)
		{
			Thread.sleep(1000);
			System.out.println("consumed element:"+sharedlist.remove(0));
			sharedlist.notify();
		}
	}
}
