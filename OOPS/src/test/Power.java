package test;

public class Power {

	private String power;
	private int rank ;
	public Power(String power, int rank)
	{
	this.power=power;
	this.rank=rank;
	}
	public void show()
	{
		System.out.println("the power is "+power+" the rank is "+rank);
	}

}
