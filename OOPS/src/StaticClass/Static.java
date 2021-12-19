package StaticClass;
import StaticClass.A.B;
import StaticClass.A.C;
//or
//import StaticClass.A.*;

public class Static {
	
	
	
	static {
		System.out.println("hum first hum first 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		A objA= new A();
		
		 //creating object of a nested class
		B objB= objA.new B();  
		//or if package is not included then 
		// A.B objB= objA.new B();
		
		objB.num=10;
		
		//creation of object of a nested static class
		C objC=new A.C();
		objC.num1=190;
		
		System.out.println(objB.num +" and "+objC.num1);
		
		
	}
	static {
		System.out.println("arey still hum first 3");
	}
	
	

}
