package graphics;
interface shapes
{
	void rectangle();
	void triangle();
	void square();
	void circle();
}
public class figures implements shapes{
   public void rectangle(float l,float b)
   {
	   System.out.println("The Area of rectangle is:"+(l*b));
   }
   public void triangle(float h, float base)
   {
	   System.out.println("The Area of triangle is:"+(0.5*h*base));
   }
   public void square(float s)
   {
	   System.out.println("The Area of square is:"+(s*s));
   }
   public void circle(float r)
   {
	   System.out.println("The Area of circle is:"+(3.14*r*r));
   }
	
}
