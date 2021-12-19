package learning;
import java.util.Scanner;
public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float result =0f,result2=0f;
		for(float i =1;i<10;i++)
		{
			if(i%2==0)
 
				result+=1/i;
			else
				result2+=1/i;
		}
	float res= result+result2;
	System.out.println(res);
	}
	

}
