package linkedlist;

import java.util.*;
public class Speed_Check_LinkedList_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//creating a linked list
    List <Integer> Array_list = new ArrayList<> ();	 
	List<Integer> Linked_list = new LinkedList<>();
	
	//calling the functions
	
	insertCalculateTime(Array_list);
	insertCalculateTime(Linked_list);
	
	
	}




//creating a method to take List as parameter
static void insertCalculateTime(List<Integer> list) {
  
	//creating a long variable start too calcultate the time in mili seconds in this part of exicution
	long start = System.currentTimeMillis();
	
	//a geranal for loop to inser elemt at index 0 and see who takes more times
	for(int i = 0;i<100000;i++)
	{
		list.add(0,i); //to  add i in the 0 index of list
	}

	long end = System.currentTimeMillis();
	
	System.out.println(list.getClass().getName()+" --> "+(end- start));
	
	/*list.getClass().getName() 
	 * what this is doing is that taht lsit is object of some class
	 * getClass() will get the class of taat object list
	 * getName() will display the name of the class he got from list.getClass()
	 * and llst.getClass().getname() will give which kind of list class is used 
	 */
	
}
}

