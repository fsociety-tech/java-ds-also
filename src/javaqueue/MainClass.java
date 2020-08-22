package javaqueue;
import java.util.*;
public class MainClass {
	public static void main(String[]args)
	{
		
//		Queue<Integer> qu = new LinkedList<>();
//		qu.add(5);
//		qu.add(55);
//		qu.add(88);
//		System.out.println(qu);
//		System.out.println(qu.remove());
//		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(45);
		mq.enqueue(44);
		mq.enqueue(66);
		mq.enqueue(22);
		System.out.println(mq);
	System.out.println(mq.dqueqe());
	}

}
