package inhertance;

public class Child1 extends ParentClass{
	
	public void work()
	{  
		System.out.println(name+" is sleeping");
	}
	protected void fucking(int num)  //method overriding
	{  
		super.fucking(num); //this is use of super keyword to call the parentclass method as due to overiding this class methods result would have showen
	this.num =num;
	System.out.println(name+" child1 class ka is fucking "+num+" times");
	}

}
