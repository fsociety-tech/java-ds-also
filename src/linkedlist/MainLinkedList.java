package linkedlist;
import java.util.*;
public class MainLinkedList {
	public static void main(String[]args)
	{
	
		MyLinkedList<String> ml = new MyLinkedList();
		for(int i=0; i<10; i++)
		{
			ml.add(i+"added");
		}
		ml.print();
		
		
		
		
	
//	List<Integer> ll = new LinkedList<>(); 
//	List<Integer> al = new ArrayList<>();
//
//	gettimeDiff(al);
//	gettimeDiff(ll);
//	System.out.println(ll.get(1));
//
//}
//	static void  gettimeDiff(List<Integer> list)
//	{
//		long start =  System.currentTimeMillis();
//		for(int i =0; i<100000; i++)
//		{
//			list.add(0,i);
//			
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName() +" "+(end - start));
//		}
	
}
	}
