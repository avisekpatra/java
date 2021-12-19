package map;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a object of HashMap we have to give 2 types one for the key and other for values
		Map<Integer,String> m = new HashMap<>();		
		
		//here we use put(key,value) to add elements
		m.put(1,"avisek");
		m.put(2,"batman");
		m.put(3,"sarthaka");
        System.out.println(m);
		
        
        //if we want to update the value of a particular key we just put the same thing again 
		
    	m.put(3,"lodu");
    	 System.out.println(m);
    	 
    	
    	

	}

}
