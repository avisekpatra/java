package learning;

public class StringReverseByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "i am batman   so fuck you";
		String[] sort = str.split(" ");
		int n=0;
		String newstr = "";
		
		
		for(String item : sort) 
		{
			n++;
		}
//		for(int j=0;j<n;j++)
//		{
//			sort[j]=sort[j].trim();
//		}
		
		
		for(int i = n-1;i>=0;i--)
		{
			newstr+=sort[i]+" ";
		}
		
		
		System.out.println(newstr.trim());
	}

}
