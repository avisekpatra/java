
import java.util.Random;
import java .util.Scanner;

public class RockPapperSeissors {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a = 0;
	int user=0;
	int computer = 0;
	int i = 0;
	boolean check= false;
	boolean winner= false;
while(i<5) {
	System.out.println("enter - rock,papper,scissor");
String str = sc.nextLine();
switch (str) {
case "rock" :  a = 0;
i++;
break;

case"papper":  a= 1;
i++;
break;

case"scissor": a =2;
i++;
break;

default:
	System.out.println("wrong input");
	 check = true;
	 winner=false;
	break;


}

if(check==true)
	break;
//0>2>1>0

Random r = new Random();
int random = r.nextInt(3);


switch(random)
{ case 0 : System.out.println("rock");
break;

case 1: System.out.println("papper");
break;

case 2: System.out.println("scissor");
break;
}

if(a==random)
	System.out.println("draw");

else if(a==0 && random==2)
	{System.out.println("You won");
	user++;}
else if(a==0 && random==1)
	{System.out.println("Computer won");
	computer++;}
else if(a==1 && random==2)
	{System.out.println("Computer won");
	computer++;}
else if(a==1 && random==0)
	{System.out.println("You won");
	user++;}
else if (a==2 && random==1)
	{System.out.println("You won");
	user++;}
else if(a==2 && random == 0)
	{System.out.println("Computer won");
	computer++;}


}
if(user>computer&& winner==true)
 System.out.println("user won by "+(user-computer)+" points");
else if(user<computer&& winner==true)
	System.out.println("computer won by "+(computer-user)+" pints");
	

	}
	

}
