package deque;
import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
ArrayDeque<Integer> ad = new ArrayDeque<>();

ad.addFirst(23);
ad.addFirst(55);
ad.pop();
ad.peek();


System.out.println(ad.peek());
	}

}
 