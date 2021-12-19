package genericsClass;

//generic class means that user can give input of his choice data type
/*user don't have use variable of given type then give any type 
 * <X,Y>   this means that X and Y are data type but not defined*/

public class GenericClass2<X , Y> {

	//we have to create variable of X and y type to perform our operation
	
	X x;
	Y y;
	
	
	
	
	//we have to create an constructor to input on object creation
	GenericClass2(X x,Y y)
	{
		this.x=x;
	this.y=y;
	   	
	}
	
	//function to print the values
	public void show()
	{
		System.out.println(x+" and "+ y);
	}
	
	
}
