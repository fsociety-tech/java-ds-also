package inheritance;

public class Person {
	
	public Person(String name)
	{
		this.name = name;
		System.out.println(" inside person constructor");
	}
	
	protected String  name;
	
	public void eat() {
		System.out.println(name +"  person is eating ");
		
	}
	
	public void walking()
	{
		System.out.println(  name + " is walking");
	}
	
	public void laugh()
	{
		System.out.println( name + " person is laughing ");
	}

}
