import java.util.StringTokenizer;

public class stringsplittokenizer {

	public static void main(String[] args) {
		
String str = new String ("i$am$batman$fuck$you");
StringTokenizer st = new StringTokenizer(str,"$");
while(st.hasMoreElements())
{
	System.out.println(st.nextToken()); 
	//or
	//System.out.println(st.nextElement());
	}
		}

}
