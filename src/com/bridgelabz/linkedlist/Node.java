package com.bridgelabz.linkedlist;

public class Node<K> implements INode<K>
{
	public K key;
	public INode next;
	
	public Node(K key)
	{
		this.key=key;
		this.next=null;
	}
	
	public INode getNext() 
	{
		return next;
	}
	
	public void setNext(INode next) 
	{
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key=key;
		
	}
	
	
}
