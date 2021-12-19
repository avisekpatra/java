package test2;

//import test.PackageTesting;
//import test.Power;
//OR
import test.*; //this meeas all the class in teh same pacakage can be accesable


public class PakageTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		PackageTesting p = new PackageTesting("Avisek Patra");
		System.out.println(p.getName());

		
		Power pow =new Power("Fire",4);
		pow.show();
		
	}

}
