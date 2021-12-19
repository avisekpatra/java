package learning;
import java.util.*;

public class CBSEMarksCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner (System.in);
	int [] marks = new int[5];	
	int sum= 0;
	boolean m = false;

	for(int i =0;i< marks.length;i++)
	{
	
	System.out.println("Enter the marks of SUBJECT "+(i+1));
	
	marks[i]= sc.nextInt();
	sum+=marks[i];
	if(marks[i]>100)
	{
		System.out.println("bhosadike itne mark aye chal bhag sale");
		 m = true ;
		break;
		
	}
		
	
	}
	
	 
	if(m==false)
	System.out.println("the % is "+(((float)sum/500)*100)+"%");

	sc.close();
	}





}
