package linkedlist;

public class MyLinkedList<E>{
	
	
	node<E> head;
	public  void add(E data)
	{
		node toadd = new node(data);
		
		if(isempty())
		{
			head = toadd;
			return;
		}
		node<E> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
			
		}
		temp.next = toadd;
	}
void print()
{
	node<E> temp = head;
	while(temp != null)
	{
		System.out.println(temp.data+" ");
		temp = temp.next;
		
	}
}

public E removelast() throws Exception {
	
	node<E> temp = head;
	if(temp==null)
	{
		throw new Exception(" cannot rempve element from an empty ll");
	}
	
	if(temp.next == null)
	{ node<E> toremove = head;
		head = null;
	return toremove.data;
	}
	while(temp.next.next != null)
	{
		temp = temp.next;
		
	}
	node<E> toremove = temp.next;
	temp.next = null;
	
	return  toremove.data;
}


public E getlast() throws Exception
{
	
	node<E> temp = head;
	if(temp==null)
	{
		throw new Exception(" cannot peek element from an empty ll");
	}
	
	
	
	while(temp.next != null)
	{
		temp = temp.next;
		
	}
return temp.data;
		
}
	public boolean isempty()
	{
	return head == null;
	}
public static class node<E>{
	public E data;
	public node<E> next;
	
	public node(E data)
	{
		this.data = data;
		next = null;
	}
}


}
