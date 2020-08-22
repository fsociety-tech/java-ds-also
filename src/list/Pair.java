package list;

public class Pair<X , Y> {

	
 X x;
 Y y;
//	String x;
//	int y;
//	public Pair(String x, int y)
//	{
//		this.x = x;
//		this.y = y;
		
 public Pair(X x, Y y)
 {
	 this.x = x;
	 this.y = y;
	 
	}
 
 public void getdiscription()
 {
	 System.out.println(x+" and "+y);
 }
}
