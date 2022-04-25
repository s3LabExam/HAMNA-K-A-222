import java.util.Scanner;

class search {
 public static void main(String args[])
 {
	 int i,size;
	 Scanner scanner= new Scanner(System.in);
	 String items[]=new String[10];
	 String search;
	 String st;
	 System.out.println("Enter the numbers of strings:");
	 size=scanner.nextInt();
	 System.out.println("Enter the strings:");
	 st=scanner.nextLine();
	 for(i=0;i<size;i++)
	 {
	  items[i]=scanner.nextLine();
	 
	 }
	 int flag=0;
	 System.out.println("Enter the string to search:");
	 search=scanner.next();
	 for(i=0;i<size;i++)
	 {
	   if(items[i].compareTo(search)==0)
	   {
		  flag=1;
		  System.out.println("item found");
	   }
	 }
	 if(flag==0)
	 {
		 System.out.println("not found");
	 }
	 
	 
 }
}
