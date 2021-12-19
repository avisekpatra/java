package singleton2;

public class AppConfig {
	
	private AppConfig()
	{
	System.out.println("sale harimi bana dia na mujhe");	
	}
	
	static AppConfig obj = null;
	
	static AppConfig getInstance()
	{
		if(obj==null)
			obj = new AppConfig();
		
	
		return obj;
	}

}
