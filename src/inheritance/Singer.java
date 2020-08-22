package inheritance;

public class Singer extends Person  {

	public Singer(String name) {
		super(name);

System.out.println(" inside Singer constructor");
	}

	public void sing()
	{
		System.out.println(name+" is singing ");
	}

	public void eat()                   //override fn
	{
		System.out.println(name+ "  is singing '' singer class override person eat fn'' ");
	}
	public void laugh()
	{
		System.out.println( name + " singer  is laughing ");
	}

}
