package exceptionHandling;

public class ThrowKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun1();
	}
	public static void fun1()
	{
		int a = 10;int b= 5;
		int c = a/b;
		System.out.println(c);
		boolean var = true;
		
		if(var==true) 
		{
			throw new ArithmeticException("hola");
			}
		
	}

	}



