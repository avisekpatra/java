package encapsulation;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//object creation
		Student s1 = new Student();
		s1.setAge(12);                // here we have assign value to the private variable using the setter method
		System.out.println(s1.getAge());    //here we call the getter method to show the age if eligible
		
		
		Student s2 = new Student();
		s2.setAge(20);
		System.out.println(s2.getAge());    //here basedon this it will print you are not eligible and 0 as the default value is 0

	}

}
