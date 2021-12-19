
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	person p1=new person();
	person p2= new person();
	p1.name = "avisek";
	p2.name = "bruce";
	
	p1.age=19;
	p2.age=37;
	
    p1.discription(89.56f);
    p2.discription(77.68f);
    
    p1.eat();
    p2.walking();
    p2.walking(12000);
	}

}
class person{
	int age;
	String name;
	
	public void eat()
	{
		System.out.println(name+" is eating");
	}
	void walking()
	{
		System.out.println(name+" is walking");
	}
	void walking(int steps) {
		System.out.println(name+" walked "+steps+" steps");
	}
	void discription(float weight)
	{
		System.out.println(name+ " is of "+ age+"age and "+weight+"kg weight");
	}
}
