package singleton;

public class AppConfig {
	int num;
	
	//1st create a private constructor so that no one can create object outside the class
	private AppConfig()
	{
		
	}
	
	//now Create an object 
	//as we are creating a static method so we haev to create a staic obj
//	static AppConfig obj= new AppConfig();    //we can use this but still it will create an object to optimise it
	
	
	static AppConfig obj = null; //as it will not create any object unless the static function is called

	//now create a static function to return the object
	//why static method cause it can be acess by the main class without any object
	// here  we can see the return type is of object so AppConfig
	public static AppConfig getInstance()  
	{
		if(obj == null)      //because when this method is called then this exicute it will save space of one object
			obj= new AppConfig();
		
		return obj; //se returning object
	}
	public void fuck(int num)
	{System.out.println(num+" times he fucked");}
	static void yo()
	{
		System.out.println("madarchod");
	}
}
