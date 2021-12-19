package comparableANDcomparators;

//creating a student class which will implements Comparable<Studemt> interface for which we have to create a compare to(Student obj) method to return vale s 
public class Student implements Comparable<Student> {

	int marks ;
	String name;
	
	//creating a constructer with arguments  int marks and name
	
	public Student(int marks,String name) {
		super();
	this.marks = marks;
	this.name = name;
	}
	
	

	@Override
	public String toString()    //to print this method
	{
		return "Student [marks ="+ marks +", name ="+ name +"]";
	}
	
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//for dessending order
	@Override
	public int compareTo(Student o) {
		if(this.marks>o.marks) return -1; //if  return negative int then current object is bigger
		else if(this.marks<o.marks) return 1; // if it return positive int the currsent object is smaller
		return 0;  //if returns zero then the both are equals
	} 
	
	
	
//	//for Assendending Order
//	@Override
//	public int compareTo(Student o)
//	{
//	if(this.marks>o.marks) return +1; //return negative means curent object is smaller
//	if(this.marks>o.marks) return -1; // retuen postive means current object is bigger
//	return 0;
//	
//		
//	}

	
  
	
	
}
