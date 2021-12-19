package sets;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(56);
		s.add(4);
		s.add(76);
		s.add(39);
		System.out.println(s.add(15));  //it return a boolean value it the element is added the true
		System.out.println(s.add(1));  //if not added and found a duplicate element is tried to insert it will return false
		System.out.println(s);
		s.remove(56);
		System.out.println(s);
		
	Set<Integer> s2 = new HashSet<>();
	
//		s2.add(1);
//		s2.add(4);
//		s.removeAll(s2); // to remove elements in s2 from s
//		System.out.println(s);
//		

	s2.add(1);
	s2.add(56);
	s2.add(4);
	s2.add(76);
	System.out.println(s2);


	//this will make the collection have eelments which are in the other collection .i.e it will fill the elements with the intersection of s and s2
	s.retainAll(s2);
System.out.println(s);


//to check that a small commection is in another collection that is it will check if the all elemnt in the collection is present in the other collection and returna boolena value

Set<Integer> s3 = new HashSet<>();

s3.add(1);
s3.add(76);
s3.add(4);

System.out.println(s.containsAll(s3)); 
		


// to convert a set into an array to perform array operation or it as required as array are continous but sets arent

Object[] arr = s2.toArray();

for(Object item: arr)
{
	System.out.print(item+" ");
	
	}








		
	}

}
