package oops;

class Vehicle{
	int wheels;
	String color;
//	Vehicle()     Non parameter constructor
//	{
//		wheels = 4;
//		
//	}
//	Vehicle(int noOfwheels)      parameterised constructor
//	{
//		wheels = noOfwheels;
//		
//	}
//}
	Vehicle(int wheels)
	{
		this.wheels =  wheels;
		
	}
	
	Vehicle(int wheels, String color)
	{
		this.wheels= wheels;
		this.color=color;
		
	}
	
	Vehicle()
	{
}
}

public class MyConstructor {
	

 MyConstructor() {


	 System.out.println("This is a constructor");
	 
 }

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

//		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(5);
		Vehicle scooty = new Vehicle(2);
//		Vehicle random = new Vehicle();     default constructor
		
		Vehicle lambo = new Vehicle(4, "RED");
		
//		System.out.println(car.wheels+" wheels in a car ,"+scooty.wheels+" Wheels in scooty");

		System.out.println(lambo.wheels+" wheels and color = "+lambo.color);
		
	}

}
