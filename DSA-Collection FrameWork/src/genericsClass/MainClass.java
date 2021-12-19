package genericsClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	GenericClass <String,Integer> c1 = new GenericClass <>("avisek",23);
	c1.show();
	c1.get("batman", 13);
	
	
	
	//object creation of genericClass2  and specifying which types  of data type on object creation
	GenericClass2 <String,Integer> g1 = new GenericClass2<>("BATMAN",7) ;
	g1.show();
	}

}
