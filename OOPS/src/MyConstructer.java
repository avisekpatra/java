
public class MyConstructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t = new Test();            //object creation
System.out.println(t.num);
		
	}

}
class Test{ 
	int num;
	Test()
	{
		num = 7;     //here we assign value to the variable in the class in the constructer
		             //so when the constructer will called i.e object is created the the value wil be assign
	}
}
