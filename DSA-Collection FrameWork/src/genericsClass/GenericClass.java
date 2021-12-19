package genericsClass;

public class GenericClass <X,Y>  
{
	 X x;
	Y y;
	GenericClass(X x,Y y)
	{
		this.x= x;
		this.y=y;
	}
	public void  show()
	{
		System.out.println(x+" and "+y);
	}
	public void get(X a,Y b)
	{
		System.out.println(a + "and"+ b);
	}

}
