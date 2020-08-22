package inheritance;

public class Teacher extends Person {

	public Teacher(String name)
	{
		super(name);
		System.out.println(" inside  teacher constructor");
	}
	public void teach()
	{
		System.out.println(name + " teaching");
	}
	
	public void eat()                                    //overrriding a fn
	{ super.eat();
		System.out.println(name +"  is eating ''this fuction is overridden'' ");        
	}
	public void laugh()
	{
		System.out.println( name + " teacher is laughing ");
	}

}
