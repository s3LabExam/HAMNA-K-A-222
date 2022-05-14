import java.util.Scanner;

interface prototype
{   
	float pi=(float) 3.14;
	void areacalc();
	void perimetercalc();
	
}
class circle implements prototype
{
	
	float radius;
	float area;
	float perimeter;
	Scanner sc=new Scanner(System.in);
	circle()
	{
	  System.out.println("Enter the radius of circle:");
	  radius=sc.nextFloat();
	}

    public void areacalc()
	{
		
         area=pi*radius*radius;
         System.out.println("The area of circle is:"+area);
	}
    public void perimetercalc() 
    {
    	
    	 perimeter=2*pi*radius;
    	 System.out.println("The perimeter of circle is:"+perimeter);
		
	}

}
class rectangle implements  prototype
{
	float width;
	float length;
	float area; 
	float perimeter;
    rectangle()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the length of rectangle :");
		length=sc.nextFloat();
		System.out.println("Enter the width of rectangle :");
		width=sc.nextFloat();
    }
	
	
	public void areacalc()
	{
		 
         area=width*length;
         System.out.println("The area of rectangle is:"+area);
	}

	
	public void perimetercalc()
	{
	
		perimeter=2*(length+width);
		System.out.println("The perimeter of rectangle is"+perimeter);
		
	}
	

}
public class q6 {

	public static void main(String[] args) {
		
		int choice;
		prototype p;
		Scanner sc=new Scanner(System.in);
		System.out.println("**********************************");
		System.out.println("\n1.Area and perimeter of Circle\n2.Area and perimeter of Rectangle");
		System.out.println("Enter the choice:");
		choice=sc.nextInt();
		     switch(choice)
		     {
		     case 1:
		    	 circle c=new circle();
		    	 p=c;
		    	 p.areacalc();
		    	 p.perimetercalc();
		    	 break;
		     case 2:
		    	 rectangle r=new rectangle();
		    	 p=r;
		    	 p.areacalc();
		    	 p.perimetercalc();
		    	 break;
		     default:
		    	System.out.println("Sorry....Wrong choice");
		    	 
		     }
		}

	}


