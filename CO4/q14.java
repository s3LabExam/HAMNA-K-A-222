import java.util.*;
public class q14 {

	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<>();
        
		deque.add("hamna");
		deque.addFirst("henna");
		deque.addLast("nihal");
		deque.push("Mommy");
		deque.offer("Vappa");
		deque.offerFirst("Mwousee");
		
		System.out.println(deque);
		
		deque.removeFirst();
		deque.removeLast();
		System.out.println("After deleteion:");
		System.out.println(deque);
	}

}
