package learning;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of students");
		int n = sc.nextInt();
		int [] marks = new int[n];
		
	for(int i = 0;i<n;i++) 
	{
      System.out.println("enter the marks of student"+(i+1));
      marks[i]= sc.nextInt();
	}
	int avg = 0;
	for(int i=0;i<n;i++) 
	{
		avg+=marks[i];
		
	}
	System.out.println("the average of mark is "+ avg/n);
		
	}

}
