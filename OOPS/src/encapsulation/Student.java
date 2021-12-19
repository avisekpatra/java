package encapsulation;

public class Student {
	private int age;  //1st make a private variable
	
	//getter method
	public int getAge()
	{
		return age;
	}
	
	//setter method to assign the value 
	public void setAge(int age)
	{
		if(age < 18)
			{this.age= age;}
		else
			System.out.println("you are not eligible");
	}

	
	
	

}
