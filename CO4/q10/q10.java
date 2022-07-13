import java.util.*;
public class q10{
   public static void main(String[] args){
       ArrayList<String> avengers=new ArrayList<String>();
       Scanner sc=new Scanner(System.in);
       int choice=0;
       System.out.println("Select the operation:");
       System.out.println("1.Add");
       System.out.println("2.Replace");
       System.out.println("3.Remove");
       System.out.println("4.Display");
       System.out.println("5.clear list");
       while(choice!=10)
       {
    	 System.out.println("Enter the operation to be performed:");
    	 choice=sc.nextInt();
    	 sc.nextLine();
       switch(choice){
       
       case 1:
                System.out.println("Enter the name to add:");
                String name=sc.nextLine();
                avengers.add(name);
                break;
       case 2:
                System.out.println("Enter the index to replace:");
                int index=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the new name:");
                String newname=sc.nextLine();
                avengers.set(index,newname);
                break;
       case 3:
                System.out.println("Enter the index to remove an name:");
                int indexx=sc.nextInt();
                avengers.remove(indexx);
                System.out.println("Item removed");
                break;
       case 4:
    	        System.out.println("ArrayList item:");
    	        for(String i:avengers)
    	        {
    	        	System.out.println(i);
    	        }
    	        break;
       case 5:
                System.out.println("WARNING:ALL NAMES WILL BE CLEARED AND IT CANNOT BE RESTORED LATER (true/false)");
                boolean output=sc.nextBoolean();
                if(output==true)
                {
                   avengers.clear();
                   System.out.println("All items cleared succesfully");
                }
                else
                {
                   exit(0);
                }
                break;
       default:  
                System.out.println("Wrong choice");
  }
 }
 }

private static void exit(int i) {
	// TODO Auto-generated method stub
	
}
 }
