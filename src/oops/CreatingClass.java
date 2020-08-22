package oops;

 class Cat
{
	boolean hasfur;
	String colour,breed;
	public void walk()
	{
		System.out.println("cat walks");
	}
	 public void sleep()
	 {
		 System.out.println("cat always wants to sleep");
	 }
	
}
 
 class Dog{
	 
	 boolean hasfur;
	 String colour,breed;
	 public void yawn()
	 {
		 System.out.println("dog always yawns all the time "+colour);
	 }
	  public void sleep()
	 {
		 System.out.println("always wants to sleep");
	 }
 }
public class CreatingClass {

	public static void main(String[] args) {

		
	Cat ca = new Cat();
	Dog dg= new Dog();
	ca.colour = "White";
	
	ca.walk();


	dg.colour = "yellow";
	dg.yawn();
	}

}
