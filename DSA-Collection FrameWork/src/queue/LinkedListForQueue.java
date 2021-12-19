package queue;

public class LinkedListForQueue<E> {
	Node<E> head;
	static class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data)
		{
			this.data = data;
		}
				
	}
	public boolean isEmpty() {
	return (head==null);
			}
		
	
	public void add(E e) {
		Node<E> toAdd = new Node<>(e);
		if(isEmpty())
			head=toAdd;
		
		Node<E> temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp=toAdd;
		
	}
	
	public E lastRemove() throws Exception
	{
		Node<E> temp =head;
		if(isEmpty())
			throw new Exception("Empty list");
			
		while(temp.next.next==null)
		{
			temp = temp.next;
		}
		E remove = temp.data;
		temp=null;
		return remove;
		
		
	}
	
	
	public E peek() throws Exception
	{
	
		if(isEmpty())
		{
			throw new Exception("Empty list");
		}
		
		Node<E> temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		return temp.data;
	}	

}
