
public class HashCodeAndEqualsMethodContract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//craeting 2 objecs of pen class
		
		pen p1 = new pen(10,"blue");
		pen p2 =new pen(10,"blue");
		
	System.out.println(p1.equals(p2)); //here checking the custom made equals() method  and now it will true when the properties values are equal but beforw it didnt
	
		
		
	}
	

	
}

class pen
{
	int price;
String colour;

//creating a consructor to assign value
public pen(int price ,String colour)
{
	this.price= price;       //assigning the value to the variables and used this keyword as the name in the arguments and in the class are same
    this.colour= colour;

}

//creating a overiding boolean method equals so that i can have xcustum functionality
@Override
public boolean equals(Object obj)  //the arguments or the parameterd sre of Object as th efuction is of Object classs
{
	//assigning the obj argument to  the object of pen that and we have to typecast the obj to (pen) type
	pen that = (pen) obj;
	
	//now creating a custom rule so that when the contents of two objects are same then it should return true when we check if they are equals
 
		  boolean equals =(this.price == that.price && this.colour.equals(that.colour)); //this.colour.equal(that.colour) is also there in STring class
	  
	return equals;
	 

	}


	}