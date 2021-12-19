package dequeue;

import  dequeue.MyDequeue;

public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		MyDequeue <Integer> d = new MyDequeue<>();
	
	d.addFirst(10);
	d.addFirst(45);
	d.addFirst(78);
	System.out.println(d.removeLast());
	d.addLast(17);
	System.out.println(d.peekLast());
		

	}

}
