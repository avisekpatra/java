package learning;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int originaNum=num;
		int sum=0;
		while(num>0)	
		{
			int rem = num%10;
			sum = sum+rem;
			num=num/10;
			
		}
		System.out.println("sum of number "+originaNum+" = "+sum);
	}

}
