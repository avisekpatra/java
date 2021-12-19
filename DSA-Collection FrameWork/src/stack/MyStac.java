package stack;
import  linkedListForstack.MyLinkedLIst;

public class MyStac<E> {

		MyLinkedLIst<E> ll = new MyLinkedLIst<>();
		
	void push(E e)
	{
		ll.add(e);
	}
		
	E pop() throws Exception
	{    if(ll.isEmpty())
		{throw new Exception("the Stack is empty ");}
		
	
		return ll.removeLast();
	
	}
	E peek() throws Exception
	{
		 if(ll.isEmpty())
			{throw new Exception("the Stack is empty ");}
			
		return ll.getLast();
	}
		
		
	}


