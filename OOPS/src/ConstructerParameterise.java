
public class ConstructerParameterise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car C1 = new Car("Honda",196272333.4332);
		Car C2 = new Car("Suziki",343838912.3748);     //here we are assign the value of the variable on object creation
		
		System.out.println(C1.Brand+" have  "+ C1.wheels+" wheels "+C1.price+" is the cost and of "+C2.color+" color");
		System.out.println(C2.Brand+" have  "+ C2.wheels+" wheels "+C2.price +" is the cost and of "+C2.color+" color");
	}
	

}
class Car{
	int wheels;
	String Brand;
	Double price;
	String color;
	
	Car()  //Default constructor
	{
		color = "yellow";
	}
	Car(String Brand,double price)           //here we are assigning values of variable in constructor using parameters 
	{
		this();                   //this() will call the default constructor
		this.Brand = Brand;         //this.Var_name is used if the name of the variable and name of the parameter variable is same
		wheels= 4;
		this.price = price;
	}
}