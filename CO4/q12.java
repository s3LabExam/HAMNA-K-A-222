import java.io.*;
import java.util.*;
public class q12 {
  public static void main(String args[])
  {
	  Stack<String> s=new Stack<>();
	  String str;
	  int size;
	  int choice=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of stack:");
	  size=sc.nextInt();
	  System.out.println("Enter the operation to be performed");
	  System.out.println("1.push");
	  System.out.println("2.Pop element from an particular index");
	  System.out.println("3.display the elements");
	  while(choice!=10)
	  {
		 System.out.println("Enter the choice:");
		 choice=sc.nextInt();
		 sc.nextLine();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("Enter the elements:");
			  for(int i=0;i<size;i++)
			  {
				  str=sc.nextLine();
				  s.push(str);
			  } 
			  break;
		 case 2:
			 System.out.println("Enter the position to remove an element:");
			  int pos=sc.nextInt();
			  s.remove(pos);
			  System.out.println("Element removed from stack");
			  break;
		 case 3:
			 System.out.println("The elements of the stack are:");
			 System.out.println(s);
			 break;
		 default:
			  System.out.println("Invalid choice");
		 }
	  }
	  
	  
  }
}
