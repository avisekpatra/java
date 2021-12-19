package sets;
import java.util.*;
public class QuestionSubArraySumEqualsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,1,3,-4,-2};
		//tp check when if the subset exist
		boolean found = false;
		
		//creating a set 
		Set<Integer> sub = new HashSet<>();
		int sum= 0;
		for(int element: a)
		{
			sub.add(sum); // we are adding the sum in the collection
			sum+=element;// updating the sum
			 if(sub.contains(sum)) //cheching if a sum is equal to previously updating sum then ,that means if the sum is already exists
			 {
				 found=true;    //we make the found true
			      break;    // and braek theloop
			 }
		}
		if(found==true)
			System.out.println("yes there is a subset");
		else
			System.out.println("no there is no subset");;
		
		
		
	}

}
