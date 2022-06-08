package arith;
interface operations
{
	void addition();
	void subtraction();
	void multiplication();
	void division();
}
public class arithmetic implements operations {


	public void addition(int a,int b) {
		System.out.println("The Addition of"+a+"and"+b+"is:"+(a+b));
		
	}


	public void subtraction(int a,int b) {
		System.out.println("The Subtraction of"+a+"and"+b+"is:"+(a-b));
		
	}


	public void multiplication(int a,int b) {
		System.out.println("The Multiplication of"+a+"and"+b+"is:"+(a*b));
		
	}

	public void division(int a,int b) {
		System.out.println("The Division of"+a+"and"+b+"is:"+(a/b));
		
	}

}
