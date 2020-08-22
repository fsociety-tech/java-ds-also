package javaqueue;

import linkedlist.MyLinkedList.node;

public class MyQueue<E> {
	
private node<E> head , rear;

public void enqueue(E e)
{   node<E> toadd = new node<>(e);
	if(head==null)
	{
		head = rear = toadd;
		return;
	}
	
	rear.next = toadd;
	rear = rear.next;

}

public E dqueqe()
{   node<E> temp = head;
if(head == null)
{
	return null;
}
	head = head.next;
	if(head == null)
	{
		rear =null;
	}
	return temp.data;
	
}
}
