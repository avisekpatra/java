package learning;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("helo world");
		
		int i =1;
		int sum=0;
		int n = sc.nextInt();
		while (i>0)
		{
			int a = sc.nextInt();
		sum+=a;
			
			if(i==n)
				break;
			i++;
		
		}
		
		System.out.println("the sum is "+ sum);

		sc.close();
	}

}
