package com.bridgelabz.linkedlist;

public class Node<K>
{
	public K key;
	public Node next;
	
	public Node(K key)
	{
		this.key=key;
		this.next=null;
	}
	
	public Node getNext() 
	{
		return next;
	}
	
	public void setNext(Node next) 
	{
		this.next = next;
	}
	
	
}
