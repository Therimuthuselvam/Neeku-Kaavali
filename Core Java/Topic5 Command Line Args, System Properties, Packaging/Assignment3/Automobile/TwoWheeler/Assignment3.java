package Automobile.TwoWheeler;
import Automobile.*;

class Hero extends Automobile.Vehicle
{
	int speed=60;
	String modelname="Splendor plus";
	String registrationnumber="AP26AX2626";
	String owner="Ramya";

	public int speed()
	{
		return speed;
	}
	
	public void radio()
	{
		System.out.println("Controlling radio device");
	}

	public String modelName()
	{
		return modelname;
	}

	public String registrationNumber()
	{
		return registrationnumber;
	}

	public String ownerName()
	{
		return owner;
	}
}

class Honda extends Automobile.Vehicle
{
	int speed=40;
	String modelname="Honda Jazz";
	String registrationnumber="AP26AX2828";
	String owner="Deepika";

	public int speed()
	{
		return speed;
	}	

	public int cdplayer()
	{
		System.out.println("Controlling cd player device which is available in the car");
	}

	public String modelName()
	{
		return modelname;
	}

	public String registrationNumber()
	{
		return registrationnumber;
	}

	public String ownerName()
	{
		return owner;
	}
}

public class Assignment3
{
public static void main(String[] args)
{
	Hero hero=new Hero();
	Honda honda=new Honda();
	

}
}