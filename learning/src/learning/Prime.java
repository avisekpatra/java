package learning;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner sc = new Scanner("System.in");
System.out.println("enter a number");
int num = sc.nextInt();
if(num<2) {
	System.out.println("number is not prime");
}
else {
for(int i=2; i<num;i++)
{ 
	if(num%i==0)
	{
		System.out.println("number is not prime");
	}
	else
	{
		System.out.println("number is prime");
	}
}
}
	}

}
