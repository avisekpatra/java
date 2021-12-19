package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "    Avisek Patra  ";
	
	//length() to find the length of a String
	System.out.println(str.length());
	
	//tolowercase()  to convert it Lowercase
	System.out.println(str.toLowerCase());
	
	//toUpperCase() to convert to uppercase
	System.out.println(str.toUpperCase());
	
	//trim() to erase or trim the space leading and triling space
	System.out.println(str.trim());
	
	//substrings(index) to print a particular substring from that index
	System.out.println(str.substring(7));
	 
	//substring(index begin, index ending) to print a substring  
	//from that index to end given index excluding the given index
	System.out.println(str.substring(2,7));
	
	//replace(original substring, new add substring)
	System.out.println(str.replace("Avi", "Lodu"));
	
	//startsWith("substring") to check if that string is starts with a particular substring and return boolean valus
	System.out.println(str.startsWith(" "));
	
	//endssWith("substring") to check  if it is ending with that particular substring or charecter
	System.out.println(str.endsWith("sek"));
	
	//charAt(index) to return a particular charecter at that index
	System.out.println(str.charAt(7));
	
	//indexOf("substring or charecter") gives  the index of that substring beging or taht charecter
	System.out.println(str.indexOf("Avi"));
	System.out.println(str.indexOf("i"));
	
	
	//indexOf("substring", from which index) to find the index of that substring  or char from that index onward
	System.out.println(str.indexOf("a", 7));
	
	//lastIndexOf("substring") to return the index of the last elemnt of the that string
	System.out.println(str.lastIndexOf("Pat"));
	
	//equal("string") to check if the given strng is equal to thisparticular string and return boolean value
	System.out.println(str.equals("Avisek patra"));
	
	//equalIgnoreCase("substring") to check it is equal ignoring the lower and upper case
	System.out.println(str.equalsIgnoreCase("    avIsEk paTrA   "));
	
	
	//to replace all spaces with _
	System.out.println(str.replace(" ","_" ));
	
	
	//to replace asubtring with anather
	String letter = "Dear <name> you fuck with us a lot ";
	System.out.println(letter.replace("<name>" , "Avisek Patra"));
	
	//to detect double and triple space
	
	System.out.println(str.())
	}
	

}
