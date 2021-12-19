package queue;

import queue.LinkedListForQueue.*;

public class MyQueue<E> {

	//creating 2 nodes head/front and rear
	
	
	
	
private Node<E> head,rear;
 

//adding function enqueue, it is performing using rear node
public void enqueue(E data)
{
	Node<E> toAdd = new Node<>(data);
	Node<E>temp=rear;
	
	
if(head==null)
	head=rear= toAdd; //if the list is empty the add the element at the 1st node which both are pointed by head and rear

rear.next=toAdd;    //now we will add the element where rear is pointing on to the next element 
rear= rear.next;    //now we will make the current position element rear
	
	}


//dequeue fuction to remove one elemnt
/*here what will happen we will be moving the head nodew
 * so we just move the head node to head.next
 * the previous element in node will we there which will be remove when garbage collecter will find 
 */
public E dequeue() throws Exception
{

	if(head==null)
	{
		throw new Exception("empty list");
		
	}
	Node<E> temp = head; //here we created a temp node to store the head node as the head node will move forward
	head=head.next; // now moving the head pointer faster 
	if(head==null) // checking suppose the list got empty and the head pointing to the next null but the rear will still be pointing the the element  
		rear=null;
	
	return temp.data;  // as we stored the head node in temp before sonowe can return the data 
	


}


	
	
}
