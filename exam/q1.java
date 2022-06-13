package exam;

import java.util.*;

public class q1 {
	class averageException
	{
		averageException(String e)
		{
			
		}
	}
  public static void main(String[] args) {
		  String name;
		  float rollno;
		  float science;
		  float maths;
		  float cs;
		  float total;
		  float per;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the name:");
	      name=sc.nextLine();
	      System.out.println("Enter the rollno:");
	      rollno=sc.nextFloat();
	      System.out.println("Enter the mark of science:");
	      science=sc.nextFloat();
	      System.out.println("Enter the mark of maths:");
	      maths=sc.nextFloat();
	      System.out.println("Enter the mark of cs:");
	      cs=sc.nextFloat();
	      total=science+maths+cs;
	      per=(total/100);
	      try 
	  	{
	  		if(per < 40)
	  		{
	  			System.out.println("failed");
	  		}
	  	}
	  	catch(Exception e)
	  	{
	  	if (per > 40) 
	  	{
            System.out.println("passed");
	  	}
	  	}
	      
	      

	}
	

	}



