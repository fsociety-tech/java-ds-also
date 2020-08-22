package javastack;

import java.util.*;
import java.util.Vector;

public class MainClass {

	public static void main(String[]args) throws Exception 
	{
//		Vector<Integer> v = new Vector();
//		v.add(22);
  StackClass<Integer> stack = new StackClass();
  
	stack.push(23);
	stack.push(25);
	stack.push(55);
	
	
	int poped = stack.pop();
	poped = stack.pop();
System.out.println(poped);
 int peeked = stack.peek();
 System.out.println(peeked);
	
	}
}
