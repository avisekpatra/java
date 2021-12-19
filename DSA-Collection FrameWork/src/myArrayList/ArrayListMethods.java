package myArrayList;
import java.util.*;
import java.util.List;


public class ArrayListMethods {
	public static void main (String [] args) {

		
		List<Integer> A = new ArrayList<>();
		//add() to add elements 
		A.add(5);
		A.add(7);
		A.add(56);
		A.add(46);
		
		
		List<Integer > B = new ArrayList<>();
		B.add(10);
		B.add(78);
		
		//to add collection of B to A
		
		A.addAll(B);
		System.out.println(A);
		
		//removeAll() method to remove a collection of arraylist
		List<Integer> remove = new ArrayList<>();
		remove.add(7);
		remove.add(78);
		
		A.removeAll(remove);
		System.out.println(A);
		
		//size of arrayList
		System.out.println(A.size());
		
		//get() to show or get A perticular element in an index
		System.out.println(A.get(1));
		
		//set() to replace a value of a particular index and ashow the output
		A.set(0,69);
		System.out.println(A);
		
		//remove() to remove a particular element from a oerticular index
		A.remove(1);
		System.out.println(A);
		
		//contain() to check that the list contain this particular elemnt
		System.out.println(A.contains(78));        //returns true
        System.out.println(A.contains(99));		//return Fals
		
        //to craete array list into an array 
        /* to ccreate an array we have to 1st create and array of sAME DATA TYPE
         * then assign it to it 
         * then print to show the elemrnts of that array
         */
        
/*     as we know all the types we can do thisor the object mway 
 *      int temp[] = new int[A.size()];  ///we have to mention the size of array as size of arraylist
         A.toArray(temp);
         for(int item : temp)
         {
          System.out.println(item);
          }
       
        */
        
        Object o[] = A.toArray();
       
        for(Object item: o)
        {
        	System.out.print("[ "+item+" ]");
        }
        
		
	}

}
