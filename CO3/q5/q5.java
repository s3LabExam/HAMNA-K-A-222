import java.util.*;
class student
{
	String name;
	int mark;
    student()
    {
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the name of student:");
    	name=sc.nextLine();
    	System.out.println("Enter the academic mark of student:");
    	mark=sc.nextInt();
    }
	
}
interface sports
{
	void sportsmark();
}
class result extends student implements sports
{
	result()
	{
		super();
	}
	int smark;
	public void sportsmark()
	{ 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sports mark:");
		smark=sc.nextInt();
    }
	void display()
	{
		System.out.println("The name of student is:"+name);
		System.out.println("The academic score of student is:"+mark);
		System.out.println("The sports score of student is:"+smark);
		System.out.println("The total mark of student is:"+(mark+smark));
		
	}
	
}
class q5
{
	public static void main(String args[])
	{
		result r=new result();
		r.sportsmark();
		r.display();
	}
}