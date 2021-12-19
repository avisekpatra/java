
public class PassBYReferance {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub

	
		Dog d = new Dog();
		Dog d2 = new Dog();
		d.legs=4;
		changedogleg(d);        //method was called using the object
		System.out.println(d.legs+" legs");
	
	
	}
	static void changedogleg(Dog dog) {    // you can see the parameters 
		                                     // is a object of the class
		dog.legs=6;  //assigning different value which will change the value by referance
	}
	
}
//creatig a class dog
class Dog{
	int legs; 
//a constructor
	Dog()
	{
		System.out.println("jai ho");
	}
}
