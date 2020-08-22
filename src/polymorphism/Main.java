package polymorphism;

public class Main {

	public static void main(String[]args)
	{
		
		Dog d = new Dog();
		
		Pet p = d;
		
		System.out.println(d.name);
		System.out.println(p.name);
		
//		d.walk();
//		p.walk();
//greeting(" ho",6);
		
	}
	public static void greeting() {
		System.out.println(" no parameter");
		
	}
	
	public static void greeting(String s) {
		System.out.println(" parameter s");
		
	}
	
	public static void greeting(String s, int count) {
		for (int i = 0; i <count ; i++) {
			System.out.println(" with s and count");
		}
		
	}
}
