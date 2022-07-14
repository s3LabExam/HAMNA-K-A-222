import java.util.*;
public class q9 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	  
	    System.out.println("Enter the size of array:");
	    int size=sc.nextInt();
	    
	    Integer[] array=new Integer[size];
	    String[] array1=new String[size];	
	    System.out.println("Enter the Integer elements:");
	    for(int i=0;i<size;i++)
	    {
	    	array[i]=sc.nextInt();
	    }
	    System.out.println("Enter the String elements:");
	    for(int j=0;j<size;j++)
	    {
	    	array1[j]=sc.next();
	    }
	    
	    BubbleSort <Integer> bubble=new BubbleSort<Integer>(array);
	    System.out.println("The Elements before Sorting:");
	    bubble.display();
	    
	    bubble.sort();
	    
	    System.out.println("The Elements After Sorting:");
	    bubble.display();
	    
	    BubbleSort <String> bubbles=new BubbleSort<String>(array1);
	    System.out.println("The Elements before Sorting:");
	    bubbles.display();
	    
	    bubbles.sort();
	    
	    System.out.println("The Elements After Sorting:");
	    bubbles.display();
	    
	}

}
