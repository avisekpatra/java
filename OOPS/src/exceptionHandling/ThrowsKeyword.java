package exceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		

		int a = 10;int b= 5;
		int c = a/b;
		System.out.println(c);
		
		
		try {
		fun1();
	}	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
		

	}
	
	
	public static void fun1() throws ArithmeticException
	{
		boolean var = true;
		
		if(var==true) 
		{
			throw new ArithmeticException("hola lauda exception");
			}
		
	}

}
