import java.util.*;
class Mythread1 extends Thread
{
	public void run()
	{
		System.out.println("The First 10 Multiplication of 5 is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println("5*"+i+"="+(i*5));
		}
	}
	
}
class Mythread2 extends Thread
{
	Scanner sc=new Scanner(System.in);
	int limit;
	int i,j;
	public void run()
	{
		System.out.println("Enter the limit:");
		limit=sc.nextInt();
	    for(i=2;i<=limit;i++)
	    {
	    	for(j=2;j<=i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			break;
	    		}
	    	}
	    	if(i==j)
	    	{
	    		System.out.println(i);
	    	}
	    }
		
	}
}

public class q5 {

	public static void main(String[] args) {
		new Mythread1().start();
	    new Mythread2().start();
	  
	    		 
	     }
	}

