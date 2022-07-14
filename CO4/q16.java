import java.util.*;
public class q16 {
	public static void main(String[] args)
	{
		HashSet<String> one= new HashSet<>();
		one.add("hamna");
		one.add("henna");
		one.add("nihal");
		
		HashSet<String> two=new HashSet<>();
		two.add("hamna");
		two.add("henna");
		two.add("nihal");
		
		System.out.println("Hash Set 1:"+one);
		System.out.println("Hash Set 2:"+two);
		
		boolean value=one.equals(two);
		System.out.println("Whether two hashsets are equal or not:"+value);
	}

}
