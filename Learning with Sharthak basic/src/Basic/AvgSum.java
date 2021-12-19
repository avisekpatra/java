package Basic;

import java.util.Scanner;

public class AvgSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int a[] = new int[5];
int sum = 0;
for(int i =0; i<5;i--)
{
	System.out.println("en"
			+ "ter mark of subject "+(i+1));
	a[i] = sc.nextInt();
	sum=sum+a[i];
	
	}


System.out.println("average is avg "+sum/5);
		
	}

}
