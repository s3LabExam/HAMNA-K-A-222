import java.util.*;
class person
{
	String name;
	String gender;
	String address;
	int age;
	person()
	{ 
	   
	   Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the name:");
       name=scanner.nextLine();
       System.out.println("Enter the gender:");
       gender=scanner.nextLine();
       System.out.println("Enter the address:");
       address=scanner.nextLine();
       System.out.println("Enter the age:");
       age=scanner.nextInt();
	}

}
class employee extends person
{

	  int empid;
	  String company_name;
	  String qualification;
	  float salary;
	  employee()
		{ 
		   super();
		   Scanner scanner=new Scanner(System.in);
	       System.out.println("Enter the empid:");
	       empid=scanner.nextInt();
	       System.out.println("Enter the company_name:");
	       company_name=scanner.nextLine();
	       scanner.nextLine();
	       System.out.println("Enter the qualification:");
	       qualification=scanner.nextLine();
	       System.out.println("Enter the salary:");
	       salary=scanner.nextFloat();
		}
   
}
class teacher extends employee
{
	int teacherid;
	String department;
	String subject;
	teacher()
	{
		   super();
		   Scanner scanner=new Scanner(System.in);
	       System.out.println("Enter the teacherid:");
	       teacherid=scanner.nextInt();
	       System.out.println("Enter the department:");
	       department=scanner.nextLine();
	       scanner.nextLine();
	       System.out.println("Enter the subject:");
	       subject=scanner.nextLine();
	}
	void display()
	{
		System.out.println("The Name is:"+name);
		System.out.println("The gender is:"+gender);
		System.out.println("The address is:"+address);
		System.out.println("The age is:"+age);
		System.out.println("The employee id is:"+empid);
		System.out.println("The company name is:"+company_name);
		System.out.println("The qualification is:"+qualification);
		System.out.println("The salary is:"+salary);
		System.out.println("The Teacher id is:"+teacherid);
		System.out.println("The department is:"+department);
		System.out.println("The subject is:"+subject);
	
		
		
	}
}
public class q3 {

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