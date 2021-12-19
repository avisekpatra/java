package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//		int a = 7;
//		int b=0;
//		int c = a/b;
		
		int  a1[] = new int[7];
		System.out.println(a1[10]);
		
//		System.out.println(a1[10]);
		
		}
		
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+" check");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" error occured ");
		}
finally
{
	System.out.println("paisa de error free experience ke liye");}
		
		
		
		System.out.println("its important to print this 44guewg3");
		
		
		
	}

}
