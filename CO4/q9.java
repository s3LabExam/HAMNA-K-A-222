import java.util.*;
class BubbleSort<T extends Comparable<? super T>> {

       T array[];
	  BubbleSort(T array[])
       {
    	   this.array=array;;
       }
	public void display() {
		  for(int i=0;i<array.length;i++)
		  {
			  System.out.println(array[i]);
		  }
	
	   }
	public void sort() {
	     for(int i=0;i<array.length-1;i++)
	     {
	    	 for(int j=0;j<(array.length)-1;j++)
	    	 {
	    		 if(array[j].compareTo(array[j+1])>0){
	    		 {
	    			T temp=array[j];
	    			array[j]=array[j+1];
	    			array[j+1]=temp;
	    			
	    			
	    		 }
	    	 }
	     }
		
	}
	}
}

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
