import java.util.*;
public class q18 {
  public static void main(String[] args)
  {
	  Map<Integer,String> hash= new HashMap<>();
	  hash.put(103,"hamna");
	  hash.put(102,"henna");
	  hash.put(101,"nihal");
	  System.out.println("HASH MAP:");
	  System.out.println(hash);
	  
	  Map<Integer,String> hash2=new TreeMap<>();
	  
	  hash2.putAll(hash);
	  
	  System.out.println("Hash Map converted to tree map");
	  System.out.println(hash2);
	  
  }
}
