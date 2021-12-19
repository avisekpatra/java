package learning;

import java.util.Scanner;

public class Pallendrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp =num;
		int newnum=0;
		while(temp>0)
		{
			int rem = temp%10;
			newnum= newnum*10+rem;
			temp =temp/10;
		}
		if(newnum==num)
		System.out.println("number is pallendrum");
		else
		System.out.println("number is not palendrum");

	}

}
