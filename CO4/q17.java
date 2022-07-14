import java.util.*;
public class q11 {
  public static void main(String[] args)
  {
	 Map<String,Integer> m = new HashMap<>();
	 m.put("hamna",10);
	 m.put("henna",11);
	 m.put("nihal",12);
	 
	 System.out.println(m);
	 
	 System.out.println(m.get("hamna"));
	 System.out.println(m.get("henna"));
	 System.out.println(m.get("nihal"));
	 
	 System.out.println(m.containsKey("henna"));
	 
	 System.out.println(m.containsValue(100));
	 
	 m.put("hamna",109);
	 System.out.println(m);
	 
	 m.replace("henna",1000);
	 System.out.println(m);
	 
	 m.putIfAbsent("mommy",30);
	 System.out.println(m);
	 
	 m.remove("hamna");
	 System.out.println(m);
  }
}
