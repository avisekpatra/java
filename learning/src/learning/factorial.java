package learning;
import java.util.Scanner;
public class factorial {

	 public static void main(String[] args) {
			// write your code here
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the number");
		        int num = sc.nextInt();
		        int result=1;
		      if(num==0)
		      { System.out.println("the factorial is 1");}
		      else{
		        for(int i = 1; i<=num;i++)
		        {
		            result = result * i;
		        }

		        System.out.println("the factorial is  " + result);
		      }

	}

}
