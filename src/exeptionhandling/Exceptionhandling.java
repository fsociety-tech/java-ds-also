package exeptionhandling;

public class Exceptionhandling {
	public static void  main(String[]args) {
		
//		try {
//			int a[]= new int[5];
//			System.out.println(a[6]);
////		int a =4;
////		int b=0;
////		 int c = a/b;
////		 System.out.println(c);
//		
//	}catch(ArithmeticException e) {
//		System.out.println(e.getMessage()+ " error occured divide by zero  check");
//	}catch(IllegalArgumentException e) {
//		System.out.println("check your casting carefully");
//	}catch(ArrayIndexOutOfBoundsException e)
//		{
//		System.out.println("index should be in range 0 in size of array");
//		}finally {
//			System.out.println(" sorry for the inconviniance");
//		}
// System.out.println("important to be execute");
//		
		fun1();
		
	 }

	static void fun1()
	{
		int a= 5;
		int b = 3;
		int c= a/b;
		System.out.println(c);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();}
		System.out.println("delay");
			}
//	try {
//			fun2();
//			
//		} catch (Exception r) {
//			System.out.println(r.getMessage()+" occured");}
//	finally {
//		System.out.println("finally");}
//	
//}}



	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger)
		{
			throw new ArrayIndexOutOfBoundsException("danger");
	}
	
}}
