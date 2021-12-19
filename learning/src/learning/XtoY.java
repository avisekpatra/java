package learning;
import java.util.Scanner;
public class XtoY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("eneter value X ");
int x = sc.nextInt();
System.out.println("enter the value od y(power)");
int y = sc.nextInt();
int res=1;
for(int i = 0;i<y;i++)
{
res = res*x;	
}
System.out.println("result is "+res);
	}

}
