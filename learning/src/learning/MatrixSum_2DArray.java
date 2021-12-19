package learning;
import java.util.Scanner;
public class MatrixSum_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row");
int row = sc.nextInt();
System.out.println("enter the column");
int col = sc.nextInt();
int a[][]= new int[row][col];
int b[][]= new int[row][col];
int c[][]= new int[row][col];

System.out.println("enter valuse in 1st array");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
{
	a[i][j]= sc.nextInt();
	}
	
}
System.out.println("enter the values in 2nd array");
for(int i=0;i<row;i++) {
	for(int j=0 ;j<col;j++) 
	
	{
		b[i][j]= sc.nextInt();
	}
}

for(int i = 0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
	}
	}
System.out.println("the sum of those 2 array is ");
for(int i=0;i<row;i++)
{for(int j=0;j<col;j++)
{ 
	System.out.print(c[i][j]+" ");
	}
System.out.println();
	}

}
	
}
