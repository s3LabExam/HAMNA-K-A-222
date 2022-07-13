import java.io.*;
import java.util.*;
public class q13 {

	public static void main(String[] args) {
		 int size;
		 PriorityQueue<String> p=new PriorityQueue<>();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Size of queue");
		 size=sc.nextInt();
		 int choice=0;
		 while(choice!=10)
		 {
			 System.out.println("Enter the operation to be performed");
			 System.out.println("1.Enqueue");
			 System.out.println("2.Peek");
			 System.out.println("3.Polling");
			 System.out.println("4.display");
			 System.out.println("Enter the choice:");
			 choice=sc.nextInt();
			 sc.nextLine();
			 switch(choice)
			 {
			 case 1:
				    System.out.println("Enter the data:");
				    for(int i=0;i<size;i++)
				    {
				    	String str=sc.nextLine();
				    	p.add(str);
				    }
				    break;
			 case 2:
				   String str=p.peek();
				   System.out.println("The peek element is:"+str);
				    break;
			 case 3:
				   p.poll();
			       break;
			 case 4:
				   System.out.println(p);
				   break;
			 default:
				  System.out.println("Invalid choice");
				   
				    
			 }
		 }
		 
		 
		 

	}

}
