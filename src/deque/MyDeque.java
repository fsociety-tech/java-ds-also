package deque;

public class MyDeque<E> {
	
	node<E> head, tail;
	
	public void addtohead(E data)
	{
	node<E> toadd = new node<>(data);
	if(head == null)
	{
		head = tail = toadd;
		return;
	}
	head.next = toadd;
	toadd.prev = head;
	head = toadd;
	}
	
	
	public E removelast()
	{
		if(head == null)
		{
			return null;
		}
		node<E>  toremove = tail;
		tail = tail.next;
		tail.prev = null;
		
		if(tail==null)
		{
			head = null;
		}
		
		return toremove.data;
		
		
	}
	
	public static class node<E>{
		
		E data;
		node<E> next , prev;
		
		public node(E data)
		{
			this.data = data;
			this.next = this.prev = null;
		}
	}

}
