package learning;

public class Methods {
	static int greater(int a,int b) 
	{
	if(a>b)return a;
	else return b;
	
	//or 
	
//	return ((a>b)?a:b);	
	}

	public static void main(String[] args) {
		
		int a=45;
		int b=78;
		
		//method calling
		int result = greater(a,b);
		System.out.println(result +" greater");

	}

}
//public class Greater{
//
//static int Check()
//{
//return a>b?a:b;
//}
//
//
//public Static void main(String [] args )
//{
//int num1= 10;
//int num2=20;
//System.out.println(check(num1,num2));
//
//}
//}