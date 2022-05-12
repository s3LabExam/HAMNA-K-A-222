import java.util.*;
class box{
	int l,w,s;
	double r;
	double pi=3.14;
	
	void area(int l,int w)
	{
		this.l=l;
		this.w=w;
		System.out.println("The area of rectangle is:"+l*w);
	
	}
	void area(int s)
	{
		this.s=s;
		System.out.println("The area of square is:"+s*s);
	}
	double area(double r)
	{
		this.r=r;
		return pi*r*r;
		
	}
	
}
public class shapes {
 public static void main(String args[])
 {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the length of the rectangle:");
	 int l=scanner.nextInt();
	 System.out.println("Enter the width of the rectangle:");
	 int w=scanner.nextInt();
	 System.out.println("Enter the side of square:");
	 int s=scanner.nextInt();
	 System.out.println("Enter the radius of circle:");
	 double r=scanner.nextDouble();
	 
	 box b=new box();
	 b.area(l,w);
	 b.area(s);
	 System.out.println("The area of circle is:"+b.area(r));
	 
	 
 }
}
