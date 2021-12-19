package singleton;

public class MainClass {

	public static void main(String[] args) {
		
		
		AppConfig obj = AppConfig.getInstance();
		//here what is happening we are creating a instance of AppConfig
		
		//as Instance is a static method its calling Syntax is className.method();
		
		//as static keyword is used to function by class in which its there so
		
		
		obj.fuck(7);
		AppConfig obj2 = AppConfig.getInstance();
		obj2.fuck(10);
		obj.fuck(8);
		AppConfig obj3 =AppConfig.getInstance();
		AppConfig.yo();
		
//remeber to call a static method write classname.fuction();
		//and static keyword is there to call it using class name and without creating any object
	}

}
