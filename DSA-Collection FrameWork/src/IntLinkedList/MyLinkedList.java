package IntLinkedList;

public class MyLinkedList {
static Node head;
static class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data= data;
		next= null;
		
	}
	
	//add fuction


}


public void add(int data)
{
	Node toAdd = new Node(data);
	Node temp = head;
	
	if(head== null)
	head=toAdd;
	else
	while(temp.next!=null)
	{
		temp = temp.next;
	}
	temp = toAdd;
	
	
}


}
