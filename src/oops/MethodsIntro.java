package oops;

public class MethodsIntro {

	public static void main(String[] args) {
//int firstNo = 23;
//int secondNo = 44;
//int  result = maxOf(firstNo,secondNo);
		int  result =maxOf(100,200);
System.out.println("max no is "+result);

//maxOf(100,200);


	}



static int maxOf(int a, int b) {

	if(a>b)
	{
		return a;
	}
	else
	{
		return b;
	}
	
	
	
}
// return a>b? a: b;
 

}