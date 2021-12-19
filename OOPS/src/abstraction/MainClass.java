package abstraction;


public class MainClass {
	public static void repairing(Car car)  //hear we will be taking class as parameters 
	{
		System.out.println("repair ho raha hai madarchod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//as Car is an abstract class its object cant be creat 
		
		luna l = new luna();
		
	luna l1 = new luna ();
		repairing(luna);
	}

}
