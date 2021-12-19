package sets;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if we want to sort the coolection in a organised way we can use tree set ,it will arrange the elemnts in an order
		
		Set<Integer> ts =new TreeSet<>();
		ts.add(56);
		ts.add(89);
		ts.add(9);
		ts.add(56);
		
		System.out.println(ts);
		
		Set<String> ts1 = new TreeSet<>();
		ts1.add("xmen");
		ts1.add("Batman");
		ts1.add("AVisek");
		ts1.add("apple");
		System.out.println(ts1);
		
	}

}
