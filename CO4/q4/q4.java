import java.util.*;
class NegativeException extends Exception
{
	NegativeException(String msg)
	{
		super(msg);
	}
}
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int elem[]=new int[5];
		int i;
		int num;
		float sum=(int) 0.0f;
		float avg=(int)0.0f;
		int count=0;
		System.out.println("Enter the total size of numbers:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++)
		{
			num=sc.nextInt();
			try {
				if(num<0)
				{
					
					throw new NegativeException("No Negative only positive");
				}
				else
				{   
					elem[i]=num;
					sum=sum+elem[i];
					count=count+1;
				}
			}catch(NegativeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		avg=(sum/count);
		System.out.println("The Average of numbers is:"+(String.format("%.2f",avg)));
		

	}

}

