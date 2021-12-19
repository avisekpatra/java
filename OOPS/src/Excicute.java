class Superclass
{
	protected String name;
	protected int a;
	
	Superclass(String name)
	{
		this.name = name;
		System.out.println("areyy main bangaya");
	}
	
	protected void walk()
	{
		
	System.out.println(name+" is walking");
	}
	
	protected void eat() {

		System.out.println(name+" is eating");
	}
	
	protected void fuck(int num)
	{
		System.out.println("Abey sale ne "+num+" times choda this year");
	}
	
	}


class Dance extends Superclass
{
	
	Dance(String name) {
		super(name);
		
	}
	protected void dance()
	{
		System.out.println(name+" is dancing");
	}
	protected void fuck(int num)
	{
		super.fuck(num);
		System.out.println(name+" is fucking "+num+" times a year");
	}
	
}


class Sing extends Superclass
{
	Sing(String name)
	{
		super(name);
	}
	protected void sing()
	{
		System.out.println(name+" is singing");
	}
	}

public class Excicute {

	public static void main(String[] args) {
		
	Dance d = new Dance("Avisek");
	d.fuck(78);
	
	
	}

}
