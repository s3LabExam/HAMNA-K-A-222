package area;

import java.util.*;
import graphics.figures;

public class q1 {

	public static void main(String[] args) {
		float l,b;
		float h,base;
		float s;
		float r;
	
		
		Scanner sc=new Scanner(System.in);
	    figures f=new figures();
	    int choice = 0;
		while(choice!=8)
		{
	        System.out.println("choose an option from below");
	        System.out.println("***************************");
			System.out.println("1.Area of rectangle");
			System.out.println("2.Area of triangle");
			System.out.println("3.Area of square");
			System.out.println("4.Area of circle");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				   System.out.println("Enter the length of rectangle:");
				   l=sc.nextFloat();
				   System.out.println("Enter the breadth of rectangle:");
				   b=sc.nextFloat();
				   f.rectangle(l,b);
			       break;
				
			case 2:
				   System.out.println("Enter the height of triangle:");
				   h=sc.nextFloat();
				   System.out.println("Enter the base of triangle:");
				   base=sc.nextFloat();
				   f.triangle(h,base);
			       break;
			       
			case 3:
				   System.out.println("Enter the side of square:");
				   s=sc.nextFloat();
				   f.square(s);
			       break;
			       
			case 4:
				   System.out.println("Enter the radius of circle:");
				   r=sc.nextFloat();
				   f.circle(r);
			       break;
			case 5:
				   System.out.println(" Program Terminated");
				   System.exit(5);
				    break;
			default:
				System.out.println("Invalid entry");
		   }
    }
		
		

	}

}
