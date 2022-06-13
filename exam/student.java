package exam;
import java.util.*;
public class student {

	

	private static int sid;
	private static String sname;
	private static String sbranch;

	public static void main(String[] args) {
	  int n;
	  int sid;
	  String sname;
      String sbranch;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the total number of students:");
	  n=sc.nextInt();
	  student obj[]=new student[10];
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Enter the sid:");
		  obj[i].sid=sc.nextInt();
		  System.out.println("Enter the name:");
		  obj[i].sname=sc.nextLine();
		  sc.nextLine();
		  System.out.println("Enter the branch:");
		  obj[i].sbranch=sc.nextLine();
		 
		  
	  }
	  for(int j = 0;j<n;j++)
	  {
		  System.out.println("The id of student is:"+obj[j].sid);
		  System.out.println("The name of student is:"+obj[j].sname);
		  System.out.println("The branch of student is:"+obj[j].sbranch);
		  
	  }

	}

}