package linkedlist;

// creating the linked list class of a generic class
public class MyLinkedList <E> {
	
	//creating a node class containg data and next refereance
	
	Node<E> head;
	
	static class Node<E>{
		E data;
		Node next; //refrance of class
		
	//craeting a constructer to data 
		
		public Node(E data)
		{
			this.data = data;
			next = null;                      //assigning next null
		}
		
		//craeting a adding ellement function
	
		public void add(E data)
		{
			Node toAdd = new Node(data);
			if(head==null)
			{
				head= toAdd;
			}
			
			
		 Node<E> temp = head;
		 while(temp.next != null)
		 {
			temp = temp.next; 
		 }
		 
		}
		
		
	}
	
	
	
	

}
