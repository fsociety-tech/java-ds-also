package abstraction;

public class RepairShop {
	public static void repairShop(Cars car )
	{
		System.out.println(" car is repaired");
	}

	public static void main(String[] args) {

		WagonR wag = new WagonR();
	    Audi aud = new Audi();
	    aud.Accelerate();
wag.Accelerate();
     wag.Breaking();
repairShop(wag);


		
		
		
	}

}
