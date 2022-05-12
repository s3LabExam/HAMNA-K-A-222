import java.util.*;
class employee
{
	String empid;
	String address;
	String name;
	float salary;
	employee()
	{ 
	   
	   Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the empid:");
       empid=scanner.nextLine();
       System.out.println("Enter the name:");
       name=scanner.nextLine();
       System.out.println("Enter the address:");
       address=scanner.nextLine();
       System.out.println("Enter the salary:");
       salary=scanner.nextFloat();
	}

}
class teacher extends employee{

	  String department;
	  String Subjects;
	  Scanner scanner=new Scanner(System.in);
	  teacher()
	  {
		  super();
		  System.out.println("Enter the department:");
		  department=scanner.nextLine();
		  System.out.println("Enter the Subjects:");
		  Subjects=scanner.nextLine();
	  }
      void display()
	  {
		System.out.println("The Employeeid:"+empid);
		System.out.println("The Address is:"+name);
		System.out.println("The Name is:"+address);
		System.out.println("The salary is:"+salary);
		System.out.println("The department is:"+department);
		System.out.println("The Subject is:"+Subjects);
	  }
}
public class q2 {

	public static void main(String[] args) {
		int i;
		Scanner scanner=new Scanner(System.in);
		teacher tech[]=new teacher[20];
		System.out.println("Enter the number of teachers:");
	    int n=scanner.nextInt();
	    for(i=0;i<n;i++)
	    {
	    	tech[i]=new teacher();
	    }
	    for(i=0;i<n;i++)
	    {
	    	tech[i].display();
	    	System.out.println();
	    }
	    
		

	}

}