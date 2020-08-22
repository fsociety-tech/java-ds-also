package javastack;

import linkedlist.MyLinkedList;

public class StackClass<E> {

	private MyLinkedList<E> ll = new MyLinkedList<>();

		
		void push(E e)
		{
			ll.add(e);
		}
		
		E pop() throws Exception{
		{
			if(ll.isempty())
			{
				throw new Exception("Pooping from empty ll is not allowed");
				
			}
			
			return ll.removelast();
			
			
		}
		}
		
	 E peek() throws Exception
	 {
		 if(ll.isempty()) {
		 throw new Exception("peeking  from empty ll is not allowed");
		 }
		return ll.getlast() ;
		
	 }

}
