package learning;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number ");
	int num = sc.nextInt();
	int j=0;
for(int i=1;i<=num;i++)	
{ 
	int res= num%i;
	if(res==0)
	{
		 j++;
		 	
	}
	 	
	}
if(j==2)
{
	System.out.println("the number is prime");
	
}
else 
{
	System.out.println(num + "number is not prime");
}
	}
	

}
