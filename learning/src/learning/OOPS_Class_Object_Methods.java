package learning;

class Cat{
	int legs,eyes;
	
	public void jump() 
	{
		System.out.println("cat is jumping");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	public void discription()
	{
		System.out.println("cat have "+eyes+" eyes and "+legs+" legs");
	}
}

public class OOPS_Class_Object_Methods {

	public static void main(String[] args) {
		
		//object creation
		Cat cat1= new Cat();
		Cat cat2 = new Cat();      
	
    //assigning values using object
	cat1.legs= 4;
	cat1.eyes=2;                 
	
	cat2.legs=8;
	cat2.eyes=3;
	
	//calling methods using objects
	cat1.jump();
	cat2.eat();                 

	cat1.discription();
	cat2.discription();
	}

}
