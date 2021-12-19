package comparableANDcomparators;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a  List of Student from ArrayList
		List<Student> s = new ArrayList<>();
		//adding object with there parameters
		s.add(new Student(10,"anuj"));
		s.add(new Student(9,"bat"));
		s.add(new Student(98,"cat"));
		s.add(new Student(16,"sat"));
		
		//now sorting the array
		Collections.sort(s);  // to sort a collection we ue Collections.sort(object of the list);
		
		s.forEach(System.out::println);
		
	}

}
