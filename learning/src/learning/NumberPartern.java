package learning;

import java.util.Scanner;

public class NumberPartern {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		for(int i =1;i<+n;i++) 
		{
			for(int j = 1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
			a++;
				
			}
			System.out.println();
		}

	}

}