package learning;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=1;
	for(int i=1;i<=1000;i++)
	{
		System.out.println("table of "+i);
		System.out.println();
		for(int j=1;j<=10;j++)
		{
			res=i*j;
			System.out.println(i+"*"+j+"="+res);
	
		}
		System.out.println();
	}
	}

}
