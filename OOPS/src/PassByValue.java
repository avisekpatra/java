
public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1=10;
		int s2=20;
		swap(s1,s2);
		System.out.println(s1+" "+s2);

	}
	static void swap(int a , int b)
	{
		int temp =a;
		a=b;
		b=temp;
		
	}

}
