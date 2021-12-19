
class Car
{ 
	int wheels;
  String name,colors;
  float price;
 
  
  Car()
  {
	colors ="yellow";  
  }
  
  
  Car(String name,int wheels)
  {
	 this();
	  this.name=name;
	  this.wheels = wheels;
	  price= 3526273.3227f;
   	  
  }
  
 
  Car(String name,float price)
  {
 this();
  this.name= name;
  this.price = price;
  wheels = 4;
	
	}

}

public class ConstructerOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 =new Car("honda",4);
		Car c2 = new Car("suziki",13526188.2732f);
		
		System.out.println("the car is "+c1.name+" and it have "
		                     +c1.wheels+" wheels and its color is "+c1.colors+" color and price is "+c1.price);
		
		
		System.out.println("the car is "+c2.name+" and it have "
                +c2.wheels+" wheels and its color is "+c2.colors+" color and price is "+c2.price);

		
	}

}



