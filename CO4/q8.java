import java.util.*;
class Stack<T>
{
	T n;
	int top=-1,i=5;
	ArrayList<T> stack=new ArrayList<T>(i);
	Stack(T n)
	{
		this.n=n;
	}
	void push(T n)
	{
	   if(top==i-1)
	   {
		   System.out.println("Overflow");
	   }
	   else
	   {
		   T str=n;
		   stack.add(n);
		   top++;
	   }
	}
	void peek()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println(stack.get(top));
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("Element removed");
			stack.remove(top);
			top--;
		}
	}
	void display()
	{
		System.out.println(stack);
	}
}
public class q8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int no;
		Stack<Integer> stack1= new Stack<Integer>(5);
	    
		while(choice!=10)
		{
			System.out.println("Enter the operation to be performed:");
			System.out.println("1.Push");
			System.out.println("2.Peek");
			System.out.println("3.Pop");
			System.out.println("4.Display");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				      System.out.println("Enter the element to be inserted:");
				      no=sc.nextInt();
				      stack1.push(no);
				      break;
			case 2:
				      stack1.peek();
				      break;
			case 3:
				      stack1.pop();
				      break;
			case 4:
				      stack1.display();
				      break;
			default:
				      System.out.println("Wrong choice");
			}
		}

	}

}
