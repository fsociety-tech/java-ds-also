package oops;


public class PassByValue {

	public static void main(String[] args) {

//	int c =12;
//	int d =23;
//	
//	swap(c,d);
//	
//	System.out.println(c+"  "+d);
		
		
    Dog a = new Dog();
    a.legs = 4;
     changeDog(a); 
     
     System.out.println(a.legs);
//	e.legs = 4;
//	Dog d = new Dog();
//	d.legs = 5;
//	
//	swap(e,d);
//	
//	System.out.println(e.legs + "  "+ d.legs);
	
	}

	
	
//	static void swap(int a,int b)
//	{
//		int temp = a;
//		a= b;
//		b= temp;
//		
//
//	}
	
	static void swap(Dog a, Dog b)
	{
		
		Dog temp= a;
		a=b;
		b=temp;
		
	}
	static void changeDog( Dog dog)
	
	{
		dog.legs = 6;
		
		
	} 
	static class Dog
	{
		int legs;
		
		
	}

	
}
