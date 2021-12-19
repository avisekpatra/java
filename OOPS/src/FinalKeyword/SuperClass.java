package FinalKeyword;

public final class SuperClass {
	
	
	//assigning a final var on there
	final int a =15;
	
	
	//assigning a final var in a bloc
	final int b;
	{
		b=20;
	}
	
	//assging final var in a static bloc
	final static int c;
	static {
		c=17;
	}

	//assigning a final var using constructor
	final String name;
    SuperClass()
    {
	name= "Avisek";
	
	}
    
    public final void fuck()
    {
    	System.out.println("SuperClasss Fuck");
    }
    
}