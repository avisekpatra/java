
public class test {

	public static void main(String args[]) {
	String res = System.getenv("PATH");
    String str = System.getProperty("os.name");
    String user = System.getenv("USERNAME");
    System.out.println(res);
    System.out.println(System.getenv("JAVA")); 
    System.out.println(user);
    System.out.println(str);
	}

}
