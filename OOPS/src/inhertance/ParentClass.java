package inhertance;

public class ParentClass {

	protected int num;
	protected String name;
	protected void walk()
	{
		System.out.println(name+"walking");
	}
	protected void eat()
	{
		System.out.println(name + " eating");
	}
	protected void fucking(int num)
	{
	this.num =num;
	System.out.println(name+"is fucking "+(num+1)+" times and fuck off");
	}
}
