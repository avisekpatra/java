package stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		MyStac <Integer> stack = new MyStac <>();
		stack.push(23);
		stack.push(16);
		stack.push(25);
		
	
		int a =stack.pop();
		System.out.println(a);
		
		
	}

}
