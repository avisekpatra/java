package learning;
import java.util.Scanner;

public class Partern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of partern");
	int n= sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		

	}

}
