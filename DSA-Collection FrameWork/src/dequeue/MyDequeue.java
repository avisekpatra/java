package dequeue;


public class MyDequeue<E> {

	//craeting a head and tail node to update and pint the current node and chnages in it 
	 Node<E> head,tail;
	
	
   static class Node<E>{
		E data;
		Node<E> prev,next;
		 public Node(E data)
		 {
			 this.data = data;
			 this.prev= null;    //prev contain referance of previous node
			 this.next= null;     
		 }
		
		 
		 
		 
		 
		
	}
	 
	 //creating function addFirst() i.e adding from the head
	 public void addFirst(E data)
	 {
		 //craeting a node toAdd to add new node
		 Node<E> toAdd = new Node<E>(data);
		 if(head==null)
			 {head=tail=toAdd;
			 return;}
	
		head.next= toAdd;    //elemnt added at the requirred position 
		toAdd.prev=head;     // postion of prev wsa updated                  
		 head= toAdd;          //now assing the new head
		 
	 }
	 
	 
	 //to Add elemnt at last i.e at tail
	  public void addLast(E data)
	 {
		 Node<E> toAdd = new Node<E>(data);
		 if(head==null)
		 { head=tail=toAdd;
		 return;}
		 
		 tail.prev=toAdd;
		 toAdd.next=tail;
		 tail=toAdd;
		 
						 
	 }
	 
	 
	 //to remove from first removeFirst()
	 public E removeFirst()
	 {
		 Node<E> temp = head;  //as the operation will happen with the head so we are storing the value of head in temp
		 if(head==null)
			return null;
		 
		 
		 head.prev= head;   // changing the location of head to its previous elemnt head.prev
		 head.next=null;     //making the next of new head element to null
		
		 if(head==null)   // if the list have only one element then we have changed the value of head but the tail will still be  pointing to that elemnt so we ghave to make the tail null when the head is null
			 tail=null;
		 
		 return temp.data;
		 
		 
	 }
	 
	 
	 //to remove from tail removeLast() thar is removing from tail
	 public E  removeLast()
	 {
		 Node<E> temp= tail;
		 if(tail==null)
			 return null;
		 
		 tail.next= tail; //pointing the tail to its next reference tail.next 
		 tail.prev=null;  //then making the new tail prev null so taht there will be no tie with the element to be rempved
		 
		
		 
		 if(tail==null)
			 head=null;
		 
		 return temp.data;
		 
		 
	 }
	 
	 //to peek from 1st 
	 public E peekFirst()

	 {     if(head==null)
		 return null;
	 
		 
		 return head.data;
		 
	 }
	 
	 //tp peek from last
	 
	 public E peekLast()
	 {
		 if(tail==null)
			 return null;
		 
		 return tail.data;
		 
	 }
	
	

}
