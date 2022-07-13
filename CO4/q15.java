import java.util.*;
public class q15 {

	public static void main(String[] args) {
		LinkedHashSet<String> l=new LinkedHashSet<>();
		l.add("hamna");
		l.add("henna");
		l.add("nihal");
		
		//never add duplicate values
		l.add("hamna");
		System.out.println(l);
		
		System.out.println("size of Linkedhashset is:"+l.size());
		
		//removing an element from set
		
		System.out.println("Element removed"+l.remove("hamna"));
		
		System.out.println("Removing element which is not present:"+l.remove("nesy"));
		
		System.out.println("Checking an element is present:"+l.contains("nihal"));
		
		System.out.println("The LinkedhashSet is:"+l);
		
	}

}
