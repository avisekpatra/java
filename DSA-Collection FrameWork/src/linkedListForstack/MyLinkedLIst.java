package linkedListForstack;

public class MyLinkedLIst <E> {

	Node<E> head;
	
	//creating a static Node class
	static class Node<E>{
		E data;
		Node<E> next;
		//creating a constructor to take value while creation
		Node(E data)
		{
			this.data= data;
			next=null;
		}
	}
		//creating a adding function add()
		public void add(E data)
		{
			//creating object of node class
			Node<E> toAdd = new Node<E>(data);
			Node<E> temp = head;
			
			//checking if the list is empty then it will
			if(isEmpty())
			{ 
				head = toAdd;
			}
			
			
			
			while(temp.next!=null) { //checking if the next reffereance is pointing null that mean its the lst element
			temp = temp.next;  //now temp will get updated
			
			}
			temp = toAdd; //then we will manually assign toAdd to the the lat element
		}
		
		public boolean isEmpty()
		{
			return head==null;
		}
	 
		
	
		public E removeLast() throws Exception
		{
			Node<E> temp = head;
			
			if(temp.next==null)  //checking if the list contain only one element 
			{
	         Node<E> toErase = temp;
	          temp=null ;
				
			}
			else if(isEmpty()) //checking if te list is empty then throw an exception
			{
				throw new Exception("You can not remove element from an empty list");
			}
			
			else {
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			}
			Node<E> toErase = temp; ///here we store the last element to remove
			temp=null; //now we reomoved the last element by assigning it null
			
			return toErase.data; //we have to return the data
			
		}
		
		public E getLast() throws Exception
		{
			if(isEmpty())
			{
				throw new Exception("you cannot see any elemnt from an empty list");
			}
			Node<E> temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			
			E getData= temp.data;
			return getData;
		}
		
		
	}
	
	
	

	


