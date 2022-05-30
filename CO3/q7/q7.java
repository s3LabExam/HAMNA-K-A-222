import java.util.*;
import java.util.Date;

public class q7 implements outline{
	int id;
	String name;
	int quantity;
	float unitprice;
	float total;
	int order;
	Date d;
	Scanner sc=new Scanner(System.in);
	public void additem()
	{
		System.out.println("Enter the product id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name:");
		name=sc.nextLine();
		System.out.println("Enter the Quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter the Unitprice:");
		unitprice=sc.nextFloat();
        total=unitprice*quantity;
		
	}
	public void addorder()
	{
		System.out.println("Enter the orderno:");
		order=sc.nextInt();
	}
	public void showheader()
	{
		System.out.println("ORDER NO:"+order);
		System.out.println("DATE:"+java.time.Clock.systemUTC().instant());
	}
	public void billdisplay()
	{
		System.out.printf("%10s %10s %10s %10s %10s",id,name,quantity,unitprice,total);
	}

	public static void main(String[] args) {
		int ch=1;
		int n=10;
		int i=0;
		float netamt=0;
		Scanner sc=new Scanner(System.in);
		q7 b[]=new q7[10];
		while(ch==1 && i<n)
		{
			System.out.println("Enter the details of Item"+(i+1));
			b[i]=new q7();
			if(i==0)
			{
				b[i].addorder();
			}
			b[i].additem();
			i++;
			System.out.println("Enter 1 to add more items else enter 0");
			ch=sc.nextInt();
		}
		b[0].showheader();
		System.out.printf("%10s %10s %10s %10s %10s","Product Id", "Name", "Quantity", "Unit price", "Total");
        System.out.println();
		for(int x=0;x<55;x++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++)
		{
			b[j].billdisplay();
			System.out.println();
		}
		for(int x=0;x<55;x++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++)
		{
			netamt=netamt+b[j].total;
		}
		System.out.println("                                        Net Amount:"+netamt);
		
		
		
		
		
	}

}
interface outline
{
	public void billdisplay();
	void additem();
	void addorder();
	void showheader();
}

