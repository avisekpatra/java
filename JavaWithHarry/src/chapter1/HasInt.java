package chapter1;

import java.util.*;
public class HasInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner (System.in);
int n=1;
while(n>0)
{
sc.nextInt();
if (sc.hasNextInt())	//hasNextInt() is used to check the user input is integer or not 
n++;                     // similarly hasNextFloat(), hasNextLine();

else
	{System.out.println("abeey sale intteger dal bhenchod");
	break;}

}
}

}
