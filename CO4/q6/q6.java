import java.util.*;
class MyRunnable1 implements Runnable
{
    public void run() {
    	Scanner sc=new Scanner(System.in);
		int n,x;
		int num1=0,num2=1;
		int num=num1+num2;
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		System.out.println("The fibonocii numbers are:");
		System.out.println(num1);
		System.out.println(num2);
		for(int i=3;i<=n;i++)
		{
		   
		   System.out.println(num);
		   num1=num2;
		   num2=num;
		   num=num1+num2;
		   
		   
		}
		
	}
}
class MyRunnable2 implements Runnable
{

	@Override
	public void run() {
	    int n;
		System.out.println("Enter the limit:");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	if(i%2==0)
	    	{
	    		System.out.println(i);
	    	}
	    }
		
	}
	
	
}
public class q6 {
	public static void main(String[] args)  {
		MyRunnable1 r1= new MyRunnable1();
		Thread thread1=new Thread(r1);
		thread1.run();
		MyRunnable2 r2=new MyRunnable2();
		Thread thread2=new Thread(r2);
		thread2.run();
	
	}
}

