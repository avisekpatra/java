package interface_multipleInheritance;

public class person implements youtuber, Student{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person obj = new person();
		 
		obj.videoedit();
		obj.youtube();
		obj.study();
		
	

	}

	public void videoedit()
	{
		System.out.println("i do video editing ");
	}
	public void study()
	{
		System.out.println("i study too");
	}
	public void youtube()
	{
		System.out.println("i post video on youtube");
	}

}
