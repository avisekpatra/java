
import java.util.*;
public class HashCodeAndEqualDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Animals a1 = new Animals("tiger","cat");
		Animals a2 = new Animals("tiger","cat");
Set<Animals> s = new HashSet<>();
s.add(a1);
s.add(a2);

System.out.println(s);



	
	}
	


	

}

class Animals
{
String name,bread;

Animals(String name,String bread)
{
this.name= name;
this.bread=bread;
	
	}

@Override
public boolean equals(Object obj) //it will take parameters of Objects
{
Animals other = (Animals) obj;    //we haev to type caste the obj tpo animals type

return this.name.equals(other.name) && this.bread.equals(other.bread);  //in String classs we can use the eqals method to check if two string are equal or not
	
	}

@Override
public int hashCode()
{
	return name.hashCode() + bread.hashCode();   //name.hasCode() and bread.hashCode will return some no and we will return our own custom rule
	
	}



}
