import java.util.Scanner;

class sort {
public static void main(String args[])
{
	int i,j,size;
	Scanner scanner=new Scanner(System.in);
	String item[]= new String[10];
	String sort[]= new String[10];
	System.out.println("Enter the size of the string:");
	size=scanner.nextInt();
	System.out.println("Enter the strings to sort:");
	for(i=0;i<size;i++)
	{
		item[i]=scanner.next();
	}
	int f = 0;
	String temp;
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(item[i].compareTo(item[j])>0)
			{
				temp=item[i];
				item[i]=item[j];
				item[j]=temp;
				
			}
		}
	}
	scanner.close();
	System.out.println("The sorted strings are");
	for(i=0;i<size;i++)
	{
       System.out.println(item[i]);
	}
	
}
}