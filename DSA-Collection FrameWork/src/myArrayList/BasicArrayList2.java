package myArrayList;
import java.util.ArrayList;

public class BasicArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//first create an ArrayList without adding the generics
	/*
	ArrayList fruits = new ArrayList();
	fruits.add("apple");
	fruits.add("lauda");
	fruits.add(23);   
	*/
	
	//ArrayList using specific generics
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
	fruits.add("banana");
	fruits.add("cherry");
	
	
	System.out.println(fruits);
	
	ArrayList<String> f2 = new ArrayList<>();
f2.add("apple");
f2.add("banana");


fruits.removeAll(f2);
fruits.clear();
System.out.println(fruits);
	
System.out.println(f2);
	
	
	}

}
