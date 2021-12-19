package queue;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyQueue<Integer> q = new MyQueue <>();
		
		q.enqueue(10);
 		q.enqueue(67);
 		q.enqueue(89);
 		
 		System.out.println(q);
 		System.out.println(q.dequeue());
 		System.out.println(q.dequeue());
 		
 		
		
	}

}
