package learning;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		
		String str1= "cat";
		String str2= "tac";
	  
	   int n= str1.length();
	   int m = str2.length();
	   boolean anagram  = false;
	   boolean check[]= new boolean[m];
	   if(m==n)
	   {
		   for(int i =0;i<n;i++)
		   {
			   char c = str1.charAt(i);
			   anagram= false;
			   for(int j= 0;j<m;j++)
			   {
				   if(str2.charAt(j)== c && !check[j])
				   {
					   anagram= true;
					   check[j]=true;
					   break;
				   }
				   
			  
			   }
			   if(!anagram)break;
		   }
		   
	   }
	   if(anagram)
	   {System.out.println("anagram");}
	   else
	   {
		   System.out.println("not anagram");
	   }
	    
	    
	    
	}

}
