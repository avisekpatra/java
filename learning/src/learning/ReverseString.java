package learning;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "i am the goddamm bat man";
String newstr[]= str.split(" ");
String revstr = new String("");
int n = str.length();
for(int i =n-1;i<n;i--)
{
	revstr= revstr +" "+ newstr[i];
	if(i==0)break;
	}
System.out.println(revstr.trim());
	
	}

}
