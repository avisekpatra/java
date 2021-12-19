package stack;

import java.util.*;
public class ParanthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Charecter> stack = new Stack<>();
		
		String str ="{(()[])}";

for(int i=0;i<str.length();i++)
{
	char ch = str.charAt(i);


	
		if(ch=='(' || ch=='[' || ch== '{')
		{
			stack.push(ch);
;		}
		else {
			
		}
	
		
	}
System.out.println(stack.peek());

		
		
	}

}
