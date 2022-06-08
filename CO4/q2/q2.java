import java.util.*;
import arith.arithmetic;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		arithmetic q=new arithmetic();
	    int a,b;
	    int choice=0;
	    System.out.println("Enter the value 1:");
	    a=sc.nextInt();
	    System.out.println("Enter the value 2:");
	    b=sc.nextInt();
	    while(choice!=6)
	    {
	    	System.out.println("Choose the operation to be performed");
	    	System.out.println("************************************");
	    	System.out.println("1.Addition:");
	    	System.out.println("2.Subtraction");
	    	System.out.println("3.Multiplication");
	    	System.out.println("4.Division");
	    	System.out.println("5.Exit");
	    	System.out.println("Enter the choice:");
	    	choice=sc.nextInt();
	    	switch(choice)
	    	{
	    	case 1:
	    		  q.addition(a,b);
	    		  break;
	    	case 2:
	    		  q.subtraction(a,b);
	    		  break;
	    	case 3:
	    		  q.multiplication(a,b);
	    		  break;
	    	case 4:
	    		  q.division(a,b);
	    		  break;
	    	case 5:
	    		  System.out.println("Terminated");
	    		  System.exit(5);
	    		  break;
	    	default:
	    		  System.out.println("Invalid operation");
	    	}
	    }

	}

}
